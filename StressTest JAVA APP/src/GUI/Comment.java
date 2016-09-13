package GUI;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.chrono.JapaneseChronology;

import com.mysql.jdbc.MySQLConnection;
import com.mysql.jdbc.PreparedStatement;

public class Comment 
{
	private String comment;
	private int id;
	private String tipo;
	
	//Database attributes
	protected DBconnect conn;
	
	//Insertar Comment
	private final String INS_COMMENT = "INSERT INTO comments (comment, tipo) VALUES (?,?)";
	//Update Comment
	private final String UPD_COMMENT = "UPDATE comments SET comment = ? WHERE id = ?";
	//Delete Comment
	private final String DEL_COMMENT = "DELETE from comment WHERE id = ?";
	//Selects All Comments
	private final String SEL_COMMENTS = "SELECT * FROM comments";
	//Selects a comment based on ID
	private final String SEL_COMMENT = "SELECT * FROM comments WHERE id = ?";
	
	//Constructor sans parameters
	public Comment(){
		comment = "";
		id = 0;
		conn = new DBconnect();
	}
	//Constructor with parameters
	public Comment(String comment,String tipo){
		this.comment = comment;
		this.tipo = tipo;
		conn = new DBconnect();
	}
	
	//Setters and Getters
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//Word counter
	public static int countWords(String s){

	    int wordCount = 0;

	    boolean word = false;
	    int endOfLine = s.length() - 1;

	    for (int i = 0; i < s.length(); i++) {
	        // if the char is a letter, word = true.
	        if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
	            word = true;
	            // if char isn't a letter and there have been letters before,
	            // counter goes up.
	        } else if (!Character.isLetter(s.charAt(i)) && word) {
	            wordCount++;
	            word = false;
	            // last word of String; if it doesn't end with a non letter, it
	            // wouldn't count without this.
	        } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
	            wordCount++;
	        }
	    }
	    return wordCount;
	}
	
	public int insertComment(){
		try{
			//Gets connection to DB
			java.sql.Connection connection= conn.getConn();
			
			//Prepares de statement
			java.sql.PreparedStatement ps = null;
			ps = connection.prepareStatement(INS_COMMENT, ps.RETURN_GENERATED_KEYS);
			//Fills consult parameters
			ps.setString(1, comment);
			ps.setString(2, tipo);
			
			//Executes update
			ps.executeUpdate();
			
			//Gets Result Set
			ResultSet rs= ps.getGeneratedKeys();
			
			if (rs.next()) {
				id = rs.getInt(1);
				return id;
			}
			else
				return -1;
			
		} catch (SQLException e){
			e.printStackTrace();
			return -1;
		}
		
	}
}
