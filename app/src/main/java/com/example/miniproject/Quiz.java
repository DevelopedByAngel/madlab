package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

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
    Button mercuryb,venusb,earthb,marsb,saturnb,jupiterb,uranusb,neptuneb;
    TextView q1,q2,q3,q4;
    RadioGroup g1,g2,g3,g4;
    int s1,s2,s3,s4;
    RadioButton o11,o12,o13,o21,o22,o23,o31,o32,o33,o41,o42,o43;
    int i=0;
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
        Button[] mainSelect={mercuryb,venusb,earthb,marsb,saturnb,jupiterb,uranusb,neptuneb};
        String[][] questions={mercury,venus,earth,mars,saturn,jupiter,uranus,neptune};
        String[][] opt1={opt11,opt21,opt31,opt41,opt51,opt62,opt71,opt81};
        String[][] opt2={opt12,opt22,opt32,opt42,opt52,opt62,opt72,opt82};
        String[][] opt3={opt13,opt23,opt33,opt43,opt53,opt63,opt73,opt83};
        while(i<8)
        {
            mainSelect[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    q1.setText(questions[i][0]);
                    o11.setText(opt1[i][0]);
                    o12.setText(opt2[i][0]);
                    o13.setText(opt3[i][0]);
                    q2.setText(questions[i][1]);
                    o21.setText(opt1[i][1]);
                    o22.setText(opt2[i][1]);
                    o23.setText(opt3[i][1]);
                    q3.setText(questions[i][2]);
                    o31.setText(opt1[i][2]);
                    o32.setText(opt2[i][2]);
                    o33.setText(opt3[i][2]);
                    q4.setText(questions[i][3]);
                    o41.setText(opt1[i][3]);
                    o42.setText(opt2[i][3]);
                    o43.setText(opt3[i][3]);
                }
            });
            i++;
        }
        mercuryb.performClick();
    }
}