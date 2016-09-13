package GUI;

public class Evaluation { 
	private Comment comment;
	private Test test;
	private boolean soundstate;
	

public Test Eval1 (){
	String nombre = "Asientos disponibles";
	String answer = "Jane";
	String premise = "En la escuela los chicos se sientan en los pupitres numerados del 1 al 5 y las chicas se sientan detras de ellos en los numerados del 6 al 10 "
			+ "\n-La chica sentada junto a la chica detras del n.1 es Fiorela."
			+ "\n-Fiorela se sienta tres pupitres mas alla que Grace."
			+ "\n-Hilary esta atras de Colin."
			+ "\n-Eddy se sienta frente a la chica sentada junto a Hilary."
			+ "\n-Colin no esta en el centro, Alan si."
			+ "\n-David esta junto a Billy."
			+ "\n-Billy se sienta tres pupitres mas alla de Colin."
			+ "\n-Fiorela no esta en el centro, Indira si."
			+ "\n-Hilary esta tres pupitres mas alla de Jane."
			+ "\n-David se sienta frente a Grace."
			+ "\n-La chica que se sienta junto a la que está frente a Alan es Jane."
			+ "\n-Colin no se sienta en el pupitre N.5."
			+ "\n-Jane no se sienta en el pupitre n.10."
			+ "\n\n-Quien esta sentado a la derecha y contiguo a Indira?";
	String subject = "Logica";
	Test test1 = new Test(nombre,answer,premise,subject);
	
	return test1;
	
}
public Test Eval2 (){
	String nombre = "Libertad";
	String answer = "A";
	String premise= "Un preso condenado a la pena de muerte, tiene una oportunidad de salvar su vida, si es capaz de resolver el siguiente problema. El Juez, mostrandole dos puertas, cada una cuidada por un guardia, le dijo:"
			+ "\nUna de estas puertas conduce a la libertad y la otra a la silla electrica; los guardias las conocen, solo que uno de ellos siempre miente y el otro guardia siempre dice la verdad. Tienes la opcion de hacer una sola pregunta a uno de ellos"
			+ "\nTras unos minutos de titubeo, el reo pregunto al guardia N:"
			+ "\n-Si le pregunto al guardia M, cual de las puertas conduce a la libertad, ¿que me respondera?."
			+ "\n-Te dira que la puerta B - respondio el custodio. Luego de oir la respuesta, el preso se encamino con toda seguridad hacia la puerta de la vida y salio libre."
			+ "\n\nPor cual de las puertas salio?";
	String subject = "Logica";
	Test test2 = new Test(nombre,answer,premise,subject);
	
	return test2;
}
}