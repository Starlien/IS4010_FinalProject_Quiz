class Question{
  private String QuestionText;
  private String option1;
  private String option2;
  private String option3;
  private String option4;
  private int answer;
  private int points;

  Question(String qt, String opt1, String opt2, String opt3, String opt4, int a, int p){
    QuestionText = qt;
    option1 = opt1;
    option2 = opt2;
    option3 = opt3;
    option4 = opt4;
    answer = a;
    points = p;
  }

  String QuestionText(){
    return QuestionText;
  }
  
  String option1(){
    return option1;
  }
  
  String option2(){
    return option2;
  }
  
  String option3(){
    return option3;
  }
  
  String option4(){
    return option4;
  }

  int answer(){
    return answer;
  }

  int points(){
    return points;
  }
}