package GUI;

public class Test {

	protected String testName;
	protected String answer;
	protected String test;
	protected String subject;
	
	public Test(String testName, String answer, String test, String subject) {
		super();
		this.testName = testName;
		this.answer = answer;
		this.test = test;
		this.subject = subject;
}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
