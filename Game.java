import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class Game implements ActionListener{
  
  //this is to read the question file and create an arraylist of Questions
  ArrayList<Question> questionSet = new ArrayList<Question>();
  String qT="", qT1="", qT2="", qT3="", qT4="", qTa="", qTp="";
  
  
  
  JFrame welcome, startScreen;
  JButton opt1, opt2, opt3, opt4, nextQ, startGame;
  JLabel  optText, optText1, optText2, optText3, optText4, currentScore, welcomeGame,space1, pointWorth, space3, space4, space5, space6, space7;
  int qNum = 0;
  int score = 0;
  Game(){

    try{
    FileReader trivia = new FileReader("questions.txt");
    BufferedReader reader = new BufferedReader(trivia);

    while(reader.ready()){
      qT = reader.readLine();
      qT1 = reader.readLine();
      qT2 = reader.readLine();
      qT3 = reader.readLine();
      qT4 = reader.readLine();
      qTa = reader.readLine();
      qTp = reader.readLine();

      Question theQuestion = new Question(qT,qT1,qT2,qT3,qT4,Integer.parseInt(qTa),Integer.parseInt(qTp));

      questionSet.add(theQuestion);
    }
    reader.close();
  }
  catch(IOException exception){
    System.out.println("An errror occurred: " + exception);
  }

    startScreen = new JFrame("Welcome to the Quiz!");
    startScreen.setLayout(new FlowLayout());
    startScreen.setSize(500,100);
    startGame = new JButton("Start");
    startGame.setPreferredSize(new Dimension(300,25));
    welcomeGame = new JLabel("<html><font color = 'red'><b>Welcome to the UC History Quiz!</b></font><br></br></html>");
    startScreen.add(welcomeGame);
    startScreen.add(startGame);
    startGame.addActionListener(this);
    startScreen.setVisible(true);


    welcome = new JFrame("Good Luck!");
  
    JPanel qPanel = new JPanel();
    qPanel.setLayout( new GridLayout(5,3,50,25));
    welcome.setLayout(new FlowLayout());
    welcome.setSize(575,300);
    
    opt1 = new JButton("A");
    opt2 = new JButton("B");
    opt3 = new JButton("C");
    opt4 = new JButton("D");
    nextQ = new JButton("Next");
    opt1.addActionListener(this);
    opt2.addActionListener(this);
    opt3.addActionListener(this);
    opt4.addActionListener(this);
    nextQ.addActionListener(this);

    optText = new JLabel("<html><font color = 'red' size='4'><b>" + questionSet.get(qNum).QuestionText()  + "</b></font></html>");
    optText1 = new JLabel(questionSet.get(qNum).option1());
    optText2 = new JLabel(questionSet.get(qNum).option2());
    optText3 = new JLabel(questionSet.get(qNum).option3());
    optText4 = new JLabel(questionSet.get(qNum).option4());
    currentScore = new JLabel("Score: " + score);
    pointWorth = new JLabel(questionSet.get(qNum).points() + " points");
    space3 = new JLabel("");
    space4 = new JLabel("");
    space5 = new JLabel("");
    space6 = new JLabel("");
    space7 = new JLabel("");

    
    welcome.add(optText);
    
    qPanel.add(opt1);
    qPanel.add(optText1);
    qPanel.add(space3);
    qPanel.add(opt2);
    qPanel.add(optText2);
    qPanel.add(space4);
    qPanel.add(opt3);
    qPanel.add(optText3);
    qPanel.add(space5);
    qPanel.add(opt4);
    qPanel.add(optText4);
    qPanel.add(space6);
    qPanel.add(pointWorth);
    qPanel.add(currentScore);
    qPanel.add(nextQ);
    welcome.getContentPane().add(qPanel);

    welcome.setVisible(false);
    



  }

  public void actionPerformed(ActionEvent ae){
    if(ae.getActionCommand().equals("Start")){
      startScreen.setVisible(false);
      welcome.setVisible(true);
      score = 0;
    }
    if(ae.getActionCommand().equals("A")){ 
      if(questionSet.get(qNum).answer() == 1){
      
        score = score + questionSet.get(qNum).points();
        optText.setText("Correct! You get " + questionSet.get(qNum).points() + " points!");
        currentScore.setText("Score: " + score);
        optText1.setVisible(false);
        optText2.setVisible(false);
        optText3.setVisible(false);
        optText4.setVisible(false);
        opt1.setVisible(false);
        opt2.setVisible(false);
        opt3.setVisible(false);
        opt4.setVisible(false);
        pointWorth.setVisible(false);
        qNum++;
      }else if(questionSet.get(qNum).answer() != 1){
        optText.setText("Incorrect! You get 0 points!");
        score = score;
        currentScore.setText("Score: " + score);
        optText1.setVisible(false);
        optText2.setVisible(false);
        optText3.setVisible(false);          
        optText4.setVisible(false);
        opt1.setVisible(false);
        opt2.setVisible(false);
        opt3.setVisible(false);
        opt4.setVisible(false);
        pointWorth.setVisible(false);
        qNum++;
      }
    }
    if(ae.getActionCommand().equals("B")){ 
      if(questionSet.get(qNum).answer() == 2){
      
        score = score + questionSet.get(qNum).points();
        optText.setText("Correct! You get " + questionSet.get(qNum).points() + " points!");
        currentScore.setText("Score: " + score);
        optText1.setVisible(false);
        optText2.setVisible(false);
        optText3.setVisible(false);
        optText4.setVisible(false);
        opt1.setVisible(false);
        opt2.setVisible(false);
        opt3.setVisible(false);
        opt4.setVisible(false);
        pointWorth.setVisible(false);
        qNum++;
      }else if(questionSet.get(qNum).answer() != 2){
        optText.setText("Incorrect! You get 0 points!");
        score = score;
        currentScore.setText("Score: " + score);
        optText1.setVisible(false);
        optText2.setVisible(false);
        optText3.setVisible(false);          
        optText4.setVisible(false);
        opt1.setVisible(false);
        opt2.setVisible(false);
        opt3.setVisible(false);
        opt4.setVisible(false);
        pointWorth.setVisible(false);
        qNum++;
      }
    }
    if(ae.getActionCommand().equals("C")){ 
      if(questionSet.get(qNum).answer() == 3){
      
        score = score + questionSet.get(qNum).points();
        optText.setText("Correct! You get " + questionSet.get(qNum).points() + " points!");
        currentScore.setText("Score: " + score);
        optText1.setVisible(false);
        optText2.setVisible(false);
        optText3.setVisible(false);
        optText4.setVisible(false);
        opt1.setVisible(false);
        opt2.setVisible(false);
        opt3.setVisible(false);
        opt4.setVisible(false);
        pointWorth.setVisible(false);
        qNum++;
      }else if(questionSet.get(qNum).answer() != 3){
        optText.setText("Incorrect! You get 0 points!");
        score = score;
        currentScore.setText("Score: " + score);
        optText1.setVisible(false);
        optText2.setVisible(false);
        optText3.setVisible(false);          
        optText4.setVisible(false);
        opt1.setVisible(false);
        opt2.setVisible(false);
        opt3.setVisible(false);
        opt4.setVisible(false);
        pointWorth.setVisible(false);
        qNum++;
      }
    }
    if(ae.getActionCommand().equals("D")){ 
      if(questionSet.get(qNum).answer() == 4){
        score = score + questionSet.get(qNum).points();
        optText.setText("Correct! You get " + questionSet.get(qNum).points() + " points!");
        currentScore.setText("Score: " + score);
        optText1.setVisible(false);
        optText2.setVisible(false);
        optText3.setVisible(false);
        optText4.setVisible(false);
        opt1.setVisible(false);
        opt2.setVisible(false);
        opt3.setVisible(false);
        opt4.setVisible(false);
        pointWorth.setVisible(false);
        qNum++;
      }else if(questionSet.get(qNum).answer() != 4){
        optText.setText("Incorrect! You get 0 points!");
        score = score;
        currentScore.setText("Score: " + score);
        optText1.setVisible(false);
        optText2.setVisible(false);
        optText3.setVisible(false);          
        optText4.setVisible(false);
        opt1.setVisible(false);
        opt2.setVisible(false);
        opt3.setVisible(false);
        opt4.setVisible(false);
        pointWorth.setVisible(false);
        qNum++;
      }
    }
    if(ae.getActionCommand().equals("Next")){
      
      if(qNum == questionSet.size()){
        nextQ.setText("Reset");
        optText.setText("You Scored a " + score +" out of 50");
        currentScore.setVisible(false);
        
      }else{
      optText.setText("<html><font color = 'red' size='4'><b>" + questionSet.get(qNum).QuestionText()  + "</b></font></html>");
      optText1.setText(questionSet.get(qNum).option1());
      optText2.setText(questionSet.get(qNum).option2());
      optText3.setText(questionSet.get(qNum).option3());
      optText4.setText(questionSet.get(qNum).option4());

      optText1.setVisible(true);
      optText2.setVisible(true);
      optText3.setVisible(true);
      optText4.setVisible(true);
      opt1.setVisible(true);
      opt2.setVisible(true);
      opt3.setVisible(true);
      opt4.setVisible(true);
      pointWorth.setVisible(true);
      }

    }
    if(ae.getActionCommand().equals("Reset")){
      qNum = 0;
      score = 0;
      nextQ.setText("Next");
      optText.setText(questionSet.get(qNum).QuestionText());
      optText1.setText(questionSet.get(qNum).option1());
      optText2.setText(questionSet.get(qNum).option2());
      optText3.setText(questionSet.get(qNum).option3());
      optText4.setText(questionSet.get(qNum).option4());
      startScreen.setVisible(true);
      welcome.setVisible(false);
      optText1.setVisible(true);
      optText2.setVisible(true);
      optText3.setVisible(true);
      optText4.setVisible(true);
      opt1.setVisible(true);
      opt2.setVisible(true);
      opt3.setVisible(true);
      opt4.setVisible(true);
      pointWorth.setVisible(true);
      currentScore.setVisible(true);
      
    }
  }




  
}