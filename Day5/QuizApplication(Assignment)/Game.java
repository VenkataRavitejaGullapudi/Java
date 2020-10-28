package com.java.quizapplication;

public class Game {
    int n=3;
    Question[] questions = new Question[n];
    Player player = new Player();

    String[] questions_data = {"Who is the Strongest Avenger?", "What is the closest planet to sun?", "What is the capital of Australia?"};
    String[] first_options = {"Iron Man","Earth","Sydney"};
    String[] second_options = {"Thor","Venus","Melbourne"};
    String[] third_options = {"Hulk","Mercury","Perth"};
    String[] fourth_options = {"Dr. Strange","Jupiter","Canberra"};

    int[] answers = {2,3,4};

    public  void initGame() {
        // Creating 5 objects
        for (int i=0;i<n;i++){
            questions[i] = new Question();
        }

        for(int i=0;i<n;i++){
            questions[i].question = questions_data[i];
            questions[i].option1 = first_options[i];
            questions[i].option2 = second_options[i];
            questions[i].option3 = third_options[i];
            questions[i].option4 = fourth_options[i];
            questions[i].correctAns = answers[i];
        }
    }

    public void play(){
        player.getDetails();
        for(int i=0;i<3;i++){
            boolean status = questions[i].askQuestion();
            if(status){
                System.out.println("Great!!!, Its correct answer");
                player.score+=5;
            }
            else {
                System.out.println("Sorry, Its wrong answer");
            }
        }
        System.out.println(player.name+", your score is "+player.score);

    }
}

//
//questions[0].question = "Who is the Strongest Avenger?";
//questions[0].option1 = "Iron Man";
//questions[0].option2 = "Thor";
//questions[0].option3 = "Hulk";
//questions[0].option4 = "Dr. Strange";
//questions[0].correctAns = 2;
//
//questions[1].question = "What is the closest planet to sun?";
//questions[1].option1 = "Earth";
//questions[1].option2 = "Venus";
//questions[1].option3 = "Mercury";
//questions[1].option4 = "Jupiter";
//questions[1].correctAns = 3;
//
//questions[2].question = "What is the capital of Australia?";
//questions[2].option1 = "Sydney";
//questions[2].option2 = "Melbourne";
//questions[2].option3 = "Perth";
//questions[2].option4 = "Canberra";
//questions[2].correctAns = 4;
