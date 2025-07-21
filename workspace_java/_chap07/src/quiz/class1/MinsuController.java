package quiz.class1;

public class MinsuController extends Student {
	
	MinsuController(){
		super("민수");
	}
	
	MinsuService minsuService = new MinsuService();
	
	@Override
	String answer(String question) {
		String result = minsuService.getInfo(question);
		return result;
	}
}
