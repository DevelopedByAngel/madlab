package com.example.miniproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {
    String[] mercury={"Scientists believe Mercury's core is made of what, exactly?\n",
        "What is Mercury known as?\n",
    "How long does it take Mercury to complete one trip around the sun?",
    "What is the position of Mercury from the sun?\n"};
    String[] opt11={"Mostly magnesium","The red planet","0.24 Earth years","First"};
    String[] opt12={"Mostly molten iron","Jewel of our solar system","11.86 Earth years","Second"};
    String[] opt13={"Mostly ice","The swiftest planet","0.62 Earth years","Fifth"};
    int[] ans1={2,3,1,1};
    String[] venus={"What is the position of Venus from the sun?",
            "Which of these statements about Venus is true?",
            "How long does it take Venus to complete one trip around the s",
    "What type of planet is Venus?"};
    String[] opt21={"Second","It's the closest planet to Earth","29.45 Earth years","Terrestrial"};
    String[] opt22={"Sixth","It's not visible to the naked eye","0.62 Earth years","Gas giant"};
    String[] opt23={"Fourth","It has many faint rings","1.88 Earth years","Ice giant"};
    int[] ans2={1,1,2,1};
    String[] earth={"What is Earth known as?",
    "What is Earth's thickest layer?",
    "What is the position of Earth from the sun?",
    "How long does it take Earth to complete one trip around the sun?"};
    String[] opt31={"Our home planet","The crust","Fourth","11.86 Earth years"};
    String[] opt32={"Jewel of our solar system","The inner core","First","0.24 Earth years"};
    String[] opt33={"The red planet","The mantle","Third","1 Earth year"};
    int[] ans3={1,3,3,3};
    String[] mars={"What is Mars' crust made of?",
    "How long does it take Mars to complete one trip around the sun?",
    "What is Mars' core made of?",
    "What is the position of Mars from the sun?"};
    String[] opt41={"Iron, magnesium, aluminum, potassium, and calcium","1.88 Earth years","Iron, nickel, and sulfur","Last"};
    String[] opt42={"Water and ammonia","164.79 Earth years","Carbon dioxide, mostly","First"};
    String[] opt43={"Frozen nitrogen, methane, and carbon monoxide","0.24 Earth years","Regolith","Fourth"};
    int[] ans4={1,1,1,3};
    String[] jupiter={"How does the length of the days on Earth compare with Jupiter?",
    "What is the position of Jupiter from the sun?",
    "What type of planet is Jupiter?",
    "How does Jupiter compare in size with Earth?"};
    String[] opt51={"Days are the same length on both planets","Sixth","Gas giant","9.5x larger"};
    String[] opt52={"Days are longer on Jupiter","Fifth","Ice giant","11.2x larger"};
    String[] opt53={"Earth has longer days","Fourth","Terrestrial","1.9x smaller"};
    int[] ans5={2,2,1,2};
    String[] saturn={"How were Saturn's rings named?",
    "How many rings does Saturn have?",
    "What is Saturn known as?",
    "How does Saturn compare in size with Earth?"};
    String[] opt61={"Numerically, by the year they were discovered","12","The sideways planet","1.9x smaller"};
    String[] opt62={"Alphabetically, as they were discovered","7","The red planet","4x larger"};
    String[] opt63={"They have no names","5","Jewel of our solar system","9.5x larger"};
    int[] ans6={2,2,3,3};
    String[] uranus={"Which of the following statements about Uranus is true?",
    "What is the position of Uranus from the sun?",
    "How does Uranus compare in size with Earth?",
    "Which of the following statements is true?"};
    String[] opt71={"It's one of the few gas giants in the solar system","Last","4x larger","Uranus has no moons"};
    String[] opt72={"It is the eighth planet from the sun","Seventh","1.9x smaller","Uranus is the fourth largest planet"};
    String[] opt73={"It has 13 faint rings","First","2.6x smaller","Uranus spins on its side as it orbits the sun"};
    int[] ans7={3,2,1,3};
    String[] neptune={"What is the position of Neptune from the sun?",
    "What do scientists think is responsible for Neptune's bright-blue hue?",
    "How does the length of the days on Earth compare with Neptune?",
    "What is Neptune known as?"};
    String[] opt81={"Last","The sun's reflection","Days are the same length on both planets","Planetary hot spot"};
    String[] opt82={"Sixth","Dust storms","Days are longer on Neptune","Jewel of our solar system"};
    String[] opt83={"Second","An unknown element in the atmosphere","Earth has longer days","The windiest planet"};
    int[] ans8={1,3,3,3};
    Button mercuryb,venusb,earthb,marsb,saturnb,jupiterb,uranusb,neptuneb,submit,tryagain;
    TextView q1,q2,q3,q4;
    RadioGroup g1,g2,g3,g4;
    int s1,s2,s3,s4;
    RadioButton o11,o12,o13,o21,o22,o23,o31,o32,o33,o41,o42,o43;
    TextView heading,scoreView;
    int i;
    int planet=0;
    TextView p1,p2,p3,p4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mercuryb=(Button)findViewById(R.id.mercury);
        venusb=(Button)findViewById(R.id.venus);
        earthb=(Button)findViewById(R.id.earth);
        marsb=(Button)findViewById(R.id.mars);
        saturnb=(Button)findViewById(R.id.saturn);
        jupiterb=(Button)findViewById(R.id.jupiter);
        uranusb=(Button)findViewById(R.id.uranus);
        neptuneb=(Button)findViewById(R.id.neptune);
        q1=(TextView)findViewById(R.id.ques1);
        q2=(TextView)findViewById(R.id.ques2);
        q3=(TextView)findViewById(R.id.ques3);
        q4=(TextView)findViewById(R.id.ques4);
        g1=(RadioGroup)findViewById(R.id.group1);
        g2=(RadioGroup)findViewById(R.id.group2);
        g3=(RadioGroup)findViewById(R.id.group3);
        g4=(RadioGroup)findViewById(R.id.group4);
        o11=(RadioButton)findViewById(R.id.opt11);
        o12=(RadioButton)findViewById(R.id.opt12);
        o13=(RadioButton)findViewById(R.id.opt13);
        o21=(RadioButton)findViewById(R.id.opt21);
        o22=(RadioButton)findViewById(R.id.opt22);
        o23=(RadioButton)findViewById(R.id.opt23);
        o31=(RadioButton)findViewById(R.id.opt31);
        o32=(RadioButton)findViewById(R.id.opt32);
        o33=(RadioButton)findViewById(R.id.opt33);
        o41=(RadioButton)findViewById(R.id.opt41);
        o42=(RadioButton)findViewById(R.id.opt42);
        o43=(RadioButton)findViewById(R.id.opt43);
        p1=(TextView)findViewById(R.id.point1);
        p2=(TextView)findViewById(R.id.point2);
        p3=(TextView)findViewById(R.id.point3);
        p4=(TextView)findViewById(R.id.point4);
        TextView[] point={p1,p2,p3,p4};
        heading=(TextView)findViewById(R.id.heading);
        submit=(Button)findViewById(R.id.submit);
        scoreView=(TextView)findViewById(R.id.score);
        String[][] questions={mercury,venus,earth,mars,saturn,jupiter,uranus,neptune};
        String[][] opt1={opt11,opt21,opt31,opt41,opt51,opt61,opt71,opt81};
        String[][] opt2={opt12,opt22,opt32,opt42,opt52,opt62,opt72,opt82};
        String[][] opt3={opt13,opt23,opt33,opt43,opt53,opt63,opt73,opt83};
        Button[] buttons={mercuryb,venusb,earthb,marsb,saturnb,jupiterb,uranusb,neptuneb};
        int[][] ans={ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8};
        tryagain=(Button)findViewById(R.id.tryagain);
        tryagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttons[planet].performClick();
            }
        });
        mercuryb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intial();
                planet=0;
                heading.setText("Mercury");
                q1.setText(questions[0][0]);
                o11.setText(opt1[0][0]);
                o12.setText(opt2[0][0]);
                o13.setText(opt3[0][0]);
                q2.setText(questions[0][1]);
                o21.setText(opt1[0][1]);
                o22.setText(opt2[0][1]);
                o23.setText(opt3[0][1]);
                q3.setText(questions[0][2]);
                o31.setText(opt1[0][2]);
                o32.setText(opt2[0][2]);
                o33.setText(opt3[0][2]);
                q4.setText(questions[0][3]);
                o41.setText(opt1[0][3]);
                o42.setText(opt2[0][3]);
                o43.setText(opt3[0][3]);
            }
        });
        venusb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intial();
                planet=1;
                heading.setText("Venus");
                q1.setText(questions[1][0]);
                o11.setText(opt1[1][0]);
                o12.setText(opt2[1][0]);
                o13.setText(opt3[1][0]);
                q2.setText(questions[1][1]);
                o21.setText(opt1[1][1]);
                o22.setText(opt2[1][1]);
                o23.setText(opt3[1][1]);
                q3.setText(questions[1][2]);
                o31.setText(opt1[1][2]);
                o32.setText(opt2[1][2]);
                o33.setText(opt3[1][2]);
                q4.setText(questions[1][3]);
                o41.setText(opt1[1][3]);
                o42.setText(opt2[1][3]);
                o43.setText(opt3[1][3]);
            }
        });
        earthb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intial();
                planet=2;
                heading.setText("Earth");
                q1.setText(questions[2][0]);
                o11.setText(opt1[2][0]);
                o12.setText(opt2[2][0]);
                o13.setText(opt3[2][0]);
                q2.setText(questions[2][1]);
                o21.setText(opt1[2][1]);
                o22.setText(opt2[2][1]);
                o23.setText(opt3[2][1]);
                q3.setText(questions[2][2]);
                o31.setText(opt1[2][2]);
                o32.setText(opt2[2][2]);
                o33.setText(opt3[2][2]);
                q4.setText(questions[2][3]);
                o41.setText(opt1[2][3]);
                o42.setText(opt2[2][3]);
                o43.setText(opt3[2][3]);
            }
        });
        marsb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intial();
                planet=3;
                heading.setText("Mars");
                q1.setText(questions[3][0]);
                o11.setText(opt1[3][0]);
                o12.setText(opt2[3][0]);
                o13.setText(opt3[3][0]);
                q2.setText(questions[3][1]);
                o21.setText(opt1[3][1]);
                o22.setText(opt2[3][1]);
                o23.setText(opt3[3][1]);
                q3.setText(questions[3][2]);
                o31.setText(opt1[3][2]);
                o32.setText(opt2[3][2]);
                o33.setText(opt3[3][2]);
                q4.setText(questions[3][3]);
                o41.setText(opt1[3][3]);
                o42.setText(opt2[3][3]);
                o43.setText(opt3[3][3]);
            }
        });
        saturnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intial();
                planet=4;
                heading.setText("Saturn");
                q1.setText(questions[4][0]);
                o11.setText(opt1[4][0]);
                o12.setText(opt2[4][0]);
                o13.setText(opt3[4][0]);
                q2.setText(questions[4][1]);
                o21.setText(opt1[4][1]);
                o22.setText(opt2[4][1]);
                o23.setText(opt3[4][1]);
                q3.setText(questions[4][2]);
                o31.setText(opt1[4][2]);
                o32.setText(opt2[4][2]);
                o33.setText(opt3[4][2]);
                q4.setText(questions[4][3]);
                o41.setText(opt1[4][3]);
                o42.setText(opt2[4][3]);
                o43.setText(opt3[4][3]);
            }
        });
        jupiterb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intial();
                planet=5;
                heading.setText("Jupiter");
                q1.setText(questions[5][0]);
                o11.setText(opt1[5][0]);
                o12.setText(opt2[5][0]);
                o13.setText(opt3[5][0]);
                q2.setText(questions[5][1]);
                o21.setText(opt1[5][1]);
                o22.setText(opt2[5][1]);
                o23.setText(opt3[5][1]);
                q3.setText(questions[5][2]);
                o31.setText(opt1[5][2]);
                o32.setText(opt2[5][2]);
                o33.setText(opt3[5][2]);
                q4.setText(questions[5][3]);
                o41.setText(opt1[5][3]);
                o42.setText(opt2[5][3]);
                o43.setText(opt3[5][3]);
            }
        });
        uranusb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intial();
                planet=6;
                heading.setText("Uranus");
                q1.setText(questions[6][0]);
                o11.setText(opt1[6][0]);
                o12.setText(opt2[6][0]);
                o13.setText(opt3[6][0]);
                q2.setText(questions[6][1]);
                o21.setText(opt1[6][1]);
                o22.setText(opt2[6][1]);
                o23.setText(opt3[6][1]);
                q3.setText(questions[6][2]);
                o31.setText(opt1[6][2]);
                o32.setText(opt2[6][2]);
                o33.setText(opt3[6][2]);
                q4.setText(questions[6][3]);
                o41.setText(opt1[6][3]);
                o42.setText(opt2[6][3]);
                o43.setText(opt3[6][3]);
            }
        });
        neptuneb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intial();
                planet=7;
                heading.setText("Neptune");
                q1.setText(questions[7][0]);
                o11.setText(opt1[7][0]);
                o12.setText(opt2[7][0]);
                o13.setText(opt3[7][0]);
                q2.setText(questions[7][1]);
                o21.setText(opt1[7][1]);
                o22.setText(opt2[7][1]);
                o23.setText(opt3[7][1]);
                q3.setText(questions[7][2]);
                o31.setText(opt1[7][2]);
                o32.setText(opt2[7][2]);
                o33.setText(opt3[7][2]);
                q4.setText(questions[7][3]);
                o41.setText(opt1[7][3]);
                o42.setText(opt2[7][3]);
                o43.setText(opt3[7][3]);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = 0;

                if (g1.getCheckedRadioButtonId() == -1 || g2.getCheckedRadioButtonId() == -1 || g3.getCheckedRadioButtonId() == -1 || g4.getCheckedRadioButtonId() == -1) {
                    Toast t = new Toast(Quiz.this);
                    t.setText("Attend all 4 questions");
                    t.show();
                }
                else {

                    RadioButton selectedButton1 = (RadioButton) findViewById(g1.getCheckedRadioButtonId());
                    int[] chose = {0, 0, 0, 0};
                    if (opt1[planet][0] == selectedButton1.getText())
                        chose[0] = 1;
                    else if (opt2[planet][0] == selectedButton1.getText())
                        chose[0] = 2;
                    else if (opt3[planet][0] == selectedButton1.getText())
                        chose[0] = 3;
                    RadioButton selectedButton2 = (RadioButton) findViewById(g2.getCheckedRadioButtonId());
                    if (opt1[planet][1] == selectedButton2.getText())
                        chose[1] = 1;
                    else if (opt2[planet][1] == selectedButton2.getText())
                        chose[1] = 2;
                    else if (opt3[planet][1] == selectedButton2.getText())
                        chose[1] = 3;
                    RadioButton selectedButton3 = (RadioButton) findViewById(g3.getCheckedRadioButtonId());
                    if (opt1[planet][2] == selectedButton3.getText())
                        chose[2] = 1;
                    else if (opt2[planet][2] == selectedButton3.getText())
                        chose[2] = 2;
                    else if (opt3[planet][2] == selectedButton3.getText())
                        chose[2] = 3;
                    RadioButton selectedButton4 = (RadioButton) findViewById(g4.getCheckedRadioButtonId());
                    if (opt1[planet][3] == selectedButton4.getText())
                        chose[3] = 1;
                    else if (opt2[planet][3] == selectedButton4.getText())
                        chose[3] = 2;
                    else if (opt3[planet][3] == selectedButton4.getText())
                        chose[3] = 3;
                    for (int j = 0; j < 4; j++) {
                        if (ans[planet][j] == chose[j])
                        {
                            score = score + 1;
                            point[j].setText("1/1");
                        }
                        else
                        {
                            point[j].setText("0/1");
                        }

                    }
                    scoreView.setText("Score = "+score);
                    submit.setVisibility(View.GONE);
                    tryagain.setVisibility(View.VISIBLE);
                    q1.setText(q1.getText()+"\nAns : "+ans[planet][0]);
                    q2.setText(q2.getText()+"\nAns : "+ans[planet][1]);
                    q3.setText(q3.getText()+"\nAns : "+ans[planet][2]);
                    q4.setText(q4.getText()+"\nAns : "+ans[planet][3]);
//                    submit.setText(score);
//                    final AlertDialog.Builder alert=new AlertDialog.Builder(Quiz.this);
//                    alert.setTitle("Score");
//                    alert.setMessage("Your score in this quiz is "+score);
//                    alert.setCancelable(false);
//                    alert.setPositiveButton("Take Quiz again", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialogInterface, int i) {
//                            Intent intent=new Intent(Quiz.this,Quiz.class);
//                            startActivity(intent);
//                        }
//                    });
//                    alert.setNegativeButton("Home", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialogInterface, int i) {
//                            Intent intent=new Intent(Quiz.this,MainActivity.class);
//                            startActivity(intent);
//                        }
//                    });
//                    AlertDialog dialog=alert.create();
//                    dialog.show();
                }
            }
        });
        mercuryb.performClick();

    }
    public void intial()
    {
        scoreView.setText("");
        tryagain.setVisibility(View.GONE);
        submit.setVisibility(View.VISIBLE);
        g1.clearCheck();
        g2.clearCheck();
        g3.clearCheck();
        g4.clearCheck();
        p1.setText("");
        p2.setText("");
        p3.setText("");
        p4.setText("");
    }
}