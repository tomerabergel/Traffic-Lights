
import javax.swing.JRadioButton;
import java.awt.*;


public class BuildTrafficLight {

    public boolean bool=false;
    private Event64[] evGreenCar,evRedCar, evEndAckCar,evEndAckCar1,evRedCarITCHOUL,evRedCarITCHOULAck,evSabatCar,evSabatPerson,evHolIARR,evHolICAR;
    private Event64[] evGreen1, evRed1,evEndAck1;
    private int i=0,degelshabat=0;
    private Event64  evClick, evShabat, evHol,evHolI,evTime,evShabatB, evENDpressed;
    private Event64 evEndGreen,evEndRed,evEndShabat,evEndHol,evEndAck,evPressed;
    public boolean finish=false;
    public boolean out=false;
    public String date;
    public int data,temp=0,tempB=0,tempC=0,countA=0,countB=0,countC=0,degelShabatA=0,degelShabatB=0,degelShabatC=0;
    final int numOfLights = 4 + 12 + 1;
   // public String date;
    enum OutState {Hol, Shabat}
    OutState outState;
public int j=0;
    enum InState {A, B, C, BItchoul,Itchoul,MidA,MidB,MidC}
    InState intState;
int count=0;
    public BuildTrafficLight() {

        //evGreen = new Event64();
       // evRed = new Event64();
        evENDpressed=new Event64();
        evTime=new Event64();
        evHolI=new Event64();
        evPressed=new Event64();
        evEndShabat=new Event64();
        evShabatB=new Event64();
        evTime=new Event64();
        evClick = new Event64();
        evShabat = new Event64();
        evHol = new Event64();
        evEndGreen=new Event64();
        evEndRed=new Event64();
        evEndShabat=new Event64();
        evEndHol=new Event64();
        evEndShabat=new Event64();
        evEndAck=new Event64();
        evGreen1=new Event64[16];
        evRed1=new Event64[16];
        evEndAck1=new Event64[16];
        evGreenCar=new Event64[4];
        evRedCar=new Event64[4];
        evEndAckCar=new Event64[4];
        evEndAckCar1=new Event64[4];
        evRedCarITCHOUL=new Event64[4];
        evRedCarITCHOULAck=new Event64[4];
        evSabatCar =new Event64[4];
        evSabatPerson =new Event64[16];
        evHolIARR=new Event64[16];
        evHolICAR=new Event64[4];
        for (i=0 ; i<16 ; i++)
        {
            evGreen1[i] = new Event64();
            evRed1[i] = new Event64();
            evEndAck1[i]=new Event64();

        }


        for (i=4 ; i<16 ; i++)
        {
            evSabatPerson[i]=new Event64();
            evHolIARR[i]=new Event64();
        }

        for (i=0 ; i<4 ; i++)
        {

            evGreenCar[i] = new Event64();
            evRedCar[i] = new Event64();
            evEndAckCar[i]= new Event64();
            evEndAckCar1[i]=new Event64();
            evRedCarITCHOUL[i]=new Event64();
            evRedCarITCHOULAck[i]=new Event64();
            evSabatCar[i]=new Event64();
            evHolICAR[i]=new Event64();

        }








    }




/*
    public void isbutton()
    {

        if (evPressed.arrivedEvent()) {
            date=(String)evPressed.waitEvent();
            outState = OutState.Hol;

            if (date=="0"||date=="6"||date=="7"||date=="9"||date=="10"||date=="12"||date=="13")
            intState = InState.BItchoul;
                else if(date=="1"||date=="4"||date=="5"||date=="6"||date=="7"||date=="9"||date=="10"||date=="12"||date=="13")

                      else if(date=="2"||date=="3"||date=="4"||date=="5"||date=="8"||date=="11"||date=="14"||date=="15")

        }


    }

*/

    public void   getRedConfirationKfizaB(){

        evEndAckCar[1].waitEvent();
        evEndAck1[4].waitEvent();
        evEndAck1[5].waitEvent();
    };

public void getRedConfirationKfiza(){


    evEndAck1[6].waitEvent();


    evEndAck1[7].waitEvent();


    evEndAck1[9].waitEvent();


    evEndAck1[10].waitEvent();


    evEndAck1[12].waitEvent();


    evEndAck1[13].waitEvent();

}

public void   getRedConfirationShabatAck(){

    for(int i=0;i<16;i++)
        evEndHol.waitEvent();
}

    public void getRedConfirationShabatEND() {
     for(int o=0; o<16;o++)
       //  if (evEndAck.arrivedEvent())
         evEndShabat.waitEvent();

    }

    public void getRedConfirationShabat() {
/*
        for (int q = 0; q < 4; q++)
          if (evEndAckCar[q].arrivedEvent())
                 evEndAckCar[q].waitEvent();

        for ( int n = 4; n<16; n++)
         if(evEndAck1[n].arrivedEvent())
               evEndAck1[n].waitEvent();
*/
if(degelShabatB==2)
{

            evEndAck1[4].waitEvent();
            evEndAck1[5].waitEvent();
    System.out.println("אנחנו בפונקצית אק של קבוצה c !" );
            degelShabatB=0;}

        if(degelShabatA==2)
        {
            evEndAck1[6].waitEvent();
            evEndAck1[7].waitEvent();
            evEndAck1[9].waitEvent();
            evEndAck1[10].waitEvent();
            evEndAck1[12].waitEvent();
            evEndAck1[13].waitEvent();
            degelShabatA=0;
        }

        if(degelShabatC==2)
            degelShabatC=0;

    }


        public void getRedConfirationA()
    {



       for (int i = 0; i <4; i++)
           evRedCarITCHOULAck[i].waitEvent();

        for (int k = 4; k <16; k++)
            evEndAck1[k].waitEvent();


    }

    public void  getRedConfirationC()
    {


        evEndAckCar[1].waitEvent();


        evEndAck1[6].waitEvent();


        evEndAck1[7].waitEvent();


        evEndAck1[9].waitEvent();


        evEndAck1[10].waitEvent();


        evEndAck1[12].waitEvent();


        evEndAck1[13].waitEvent();


    }

    public void getRedConfirationB()
    {


            evEndAckCar[0].waitEvent();


    }
    public void getRedConfirationD()
    {

        evEndAckCar[2].waitEvent();


        evEndAckCar[3].waitEvent();


        evEndAck1[4].waitEvent();


        evEndAck1[5].waitEvent();


        evEndAck1[8].waitEvent();


        evEndAck1[11].waitEvent();


        evEndAck1[14].waitEvent();


        evEndAck1[15].waitEvent();

    }
    public void init()

    {

        //for (int i = 0; i < ramzorim - 1; i++)


        Ramzor ramzorim[] = new Ramzor[numOfLights];
        ramzorim[0] = new Ramzor(3, 40, 430, 110, 472, 110, 514, 110);
        ramzorim[1] = new Ramzor(3, 40, 450, 310, 450, 352, 450, 394);
        ramzorim[2] = new Ramzor(3, 40, 310, 630, 280, 605, 250, 580);
        ramzorim[3] = new Ramzor(3, 40, 350, 350, 308, 350, 266, 350);

        ramzorim[4] = new Ramzor(2, 20, 600, 18, 600, 40);
        ramzorim[5] = new Ramzor(2, 20, 600, 227, 600, 205);
        ramzorim[6] = new Ramzor(2, 20, 600, 255, 600, 277);
        ramzorim[7] = new Ramzor(2, 20, 600, 455, 600, 433);
        ramzorim[8] = new Ramzor(2, 20, 575, 475, 553, 475);
        ramzorim[9] = new Ramzor(2, 20, 140, 608, 150, 590);
        ramzorim[10] = new Ramzor(2, 20, 205, 475, 193, 490);
        ramzorim[11] = new Ramzor(2, 20, 230, 475, 250, 475);
        ramzorim[12] = new Ramzor(2, 20, 200, 453, 200, 433);
        ramzorim[13] = new Ramzor(2, 20, 200, 255, 200, 277);
        ramzorim[14] = new Ramzor(2, 20, 200, 227, 200, 205);
        ramzorim[15] = new Ramzor(2, 20, 200, 18, 200, 40);

        ramzorim[16] = new Ramzor(1, 30, 555, 645);

        TrafficLightFrame tlf = new TrafficLightFrame(" ���''� installation of traffic lights", ramzorim);



        new Echad(ramzorim[16], tlf.myPanel);

        MyActionListener myListener = new MyActionListener();
        myListener.MyActionListener(evShabatB,evPressed,evHolI,evENDpressed);

        JRadioButton butt[] = new JRadioButton[13];




        for (int i = 0; i < butt.length -1; i++) {
            butt[i] = new JRadioButton();
            butt[i].setName(Integer.toString(i + 4));
            butt[i].setOpaque(false);
            butt[i].addActionListener(myListener);
            tlf.myPanel.add(butt[i]);
        }
        butt[0].setBounds(620, 30, 18, 18);
        butt[1].setBounds(620, 218, 18, 18);
        butt[2].setBounds(620, 267, 18, 18);
        butt[3].setBounds(620, 447, 18, 18);
        butt[4].setBounds(566, 495, 18, 18);
        butt[5].setBounds(162, 608, 18, 18);
        butt[6].setBounds(213, 495, 18, 18);
        butt[7].setBounds(240, 457, 18, 18);
        butt[8].setBounds(220, 443, 18, 18);
        butt[9].setBounds(220, 267, 18, 18);
        butt[10].setBounds(220, 218, 18, 18);
        butt[11].setBounds(220, 30, 18, 18);

        //MyActionListener myListener1 = new MyActionListener();
      //  myListener1.MyActionListener(evShabatB,evPressed, evHolI);

        butt[12] = new JRadioButton();
        butt[12].setName(Integer.toString(16));
        butt[12].setBounds(50, 30, 100, 20);
        butt[12].setText("SHABAT/HOL");
        butt[12].setOpaque(false);
        butt[12].addActionListener(myListener);
        tlf.myPanel.add(butt[12]);






            outState = OutState.Hol;
            intState = InState.BItchoul;

            while (!finish)
            {

                switch (outState) {


                    case Hol:

                        while (!out) {

                            switch (intState)

                            {
                                case BItchoul:


                                    System.out.println("איתחול תוכנית" );

                                    MyTimer72 mytimer19 = new MyTimer72(1000, evTime);
                                    evTime.waitEvent();

                                    new ShloshaAvot(ramzorim[0], tlf.myPanel, evGreenCar[0], evRedCar[0],  evHolICAR[0], evSabatCar[0], evEndShabat, evEndHol, evEndAckCar[0], evRedCarITCHOUL[0], evRedCarITCHOULAck[0], 1);
                                    evRedCarITCHOUL[0].sendEvent(1);

                                    new ShloshaAvot(ramzorim[1], tlf.myPanel, evGreenCar[1], evRedCar[1],  evHolICAR[1], evSabatCar[1], evEndShabat, evEndHol, evEndAckCar[1], evRedCarITCHOUL[1], evRedCarITCHOULAck[1], 2);
                                    evRedCarITCHOUL[1].sendEvent(1);

                                    new ShloshaAvot(ramzorim[2], tlf.myPanel, evGreenCar[2], evRedCar[2],  evHolICAR[2], evSabatCar[2], evEndShabat, evEndHol, evEndAckCar[2], evRedCarITCHOUL[2], evRedCarITCHOULAck[2], 3);
                                    evRedCarITCHOUL[2].sendEvent(1);

                                    new ShloshaAvot(ramzorim[3], tlf.myPanel, evGreenCar[3], evRedCar[3],  evHolICAR[3], evSabatCar[3], evEndShabat, evEndHol, evEndAckCar[3], evRedCarITCHOUL[3], evRedCarITCHOULAck[3], 4);
                                    evRedCarITCHOUL[3].sendEvent(1);

                                    new ShneyLuchot(ramzorim[4], tlf.myPanel, evGreen1[4], evRed1[4],  evHolIARR[4], evSabatPerson[4], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[4]);
                                    evRed1[4].sendEvent(4);

                                    new ShneyLuchot(ramzorim[5], tlf.myPanel, evGreen1[5], evRed1[5],  evHolIARR[5], evSabatPerson[5], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[5]);
                                    evRed1[5].sendEvent(5);

                                    new ShneyLuchot(ramzorim[6], tlf.myPanel, evGreen1[6], evRed1[6],  evHolIARR[6], evSabatPerson[6], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[6]);
                                    evRed1[6].sendEvent(6);

                                    new ShneyLuchot(ramzorim[7], tlf.myPanel, evGreen1[7], evRed1[7],  evHolIARR[7], evSabatPerson[7], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[7]);
                                    evRed1[7].sendEvent(7);

                                    new ShneyLuchot(ramzorim[8], tlf.myPanel, evGreen1[8], evRed1[8],  evHolIARR[8], evSabatPerson[8], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[8]);
                                    evRed1[8].sendEvent(8);

                                    new ShneyLuchot(ramzorim[9], tlf.myPanel, evGreen1[9], evRed1[9],  evHolIARR[9], evSabatPerson[9], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[9]);
                                    evRed1[9].sendEvent(9);

                                    new ShneyLuchot(ramzorim[10], tlf.myPanel, evGreen1[10], evRed1[10],  evHolIARR[10], evSabatPerson[10], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[10]);
                                    evRed1[10].sendEvent(10);

                                    new ShneyLuchot(ramzorim[11], tlf.myPanel, evGreen1[11], evRed1[11],  evHolIARR[11], evSabatPerson[11], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[11]);
                                    evRed1[11].sendEvent(11);

                                    new ShneyLuchot(ramzorim[12], tlf.myPanel, evGreen1[12], evRed1[12],  evHolIARR[12], evSabatPerson[12], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[12]);
                                    evRed1[12].sendEvent(12);

                                    new ShneyLuchot(ramzorim[13], tlf.myPanel, evGreen1[13], evRed1[13],  evHolIARR[13], evSabatPerson[13], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[13]);
                                    evRed1[13].sendEvent(13);

                                    new ShneyLuchot(ramzorim[14], tlf.myPanel, evGreen1[14], evRed1[14],  evHolIARR[14], evSabatPerson[14], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[14]);
                                    evRed1[14].sendEvent(14);

                                    new ShneyLuchot(ramzorim[15], tlf.myPanel, evGreen1[15], evRed1[15],  evHolIARR[15], evSabatPerson[15], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[15]);
                                    evRed1[15].sendEvent(15);


                                    intState = InState.Itchoul;
                                    System.out.println("אחרי האתחול-יאלה לצומת!" );

                                    break;

                                case Itchoul:

//if(tempB==0)
                                    getRedConfirationA();

                                    MyTimer72 mytimer24 = new MyTimer72(1000, evTime);
                                    evTime.waitEvent();

                                    new ShloshaAvot(ramzorim[0], tlf.myPanel, evGreenCar[0], evRedCar[0],  evHolICAR[0], evSabatCar[0], evEndShabat, evEndHol, evEndAckCar[0], evRedCarITCHOUL[0], evRedCarITCHOULAck[0], 1);

                                    evGreenCar[0].sendEvent();

                                    new ShneyLuchot(ramzorim[6], tlf.myPanel, evGreen1[6], evRed1[6],  evHolIARR[6], evSabatPerson[6], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[6]);

                                    evGreen1[6].sendEvent();

                                    new ShneyLuchot(ramzorim[7], tlf.myPanel, evGreen1[7], evRed1[7],  evHolIARR[7], evSabatPerson[7], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[7]);

                                    evGreen1[7].sendEvent();

                                    new ShneyLuchot(ramzorim[9], tlf.myPanel, evGreen1[9], evRed1[9],  evHolIARR[9], evSabatPerson[9], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[9]);

                                    evGreen1[9].sendEvent();


                                    new ShneyLuchot(ramzorim[10], tlf.myPanel, evGreen1[10], evRed1[10],  evHolIARR[10], evSabatPerson[10], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[10]);

                                    evGreen1[10].sendEvent();


                                    new ShneyLuchot(ramzorim[12], tlf.myPanel, evGreen1[12], evRed1[12],  evHolIARR[12], evSabatPerson[12], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[12]);
                                    evGreen1[12].sendEvent();


                                    new ShneyLuchot(ramzorim[13], tlf.myPanel, evGreen1[13], evRed1[13],  evHolIARR[13], evSabatPerson[13], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[13]);

                                    evGreen1[13].sendEvent();
                                    tempB=0;
                                    intState = InState.A;


                                    break;
                                case A:

                                    butt[2].setEnabled(false);
                                    butt[3].setEnabled(false);
                                    butt[5].setEnabled(false);
                                    butt[6].setEnabled(false);
                                    butt[8].setEnabled(false);
                                    butt[9].setEnabled(false);


                                    System.out.println("אנחנו במצב A-יש אפשר לחצות את הצומת בבטחה!!!" );


                                     MyTimer72 mytimer1 = new MyTimer72(15000, evTime);
                                    System.out.println("1" );
                                     evTime.waitEvent();





                                   // else {

                                        new ShloshaAvot(ramzorim[0], tlf.myPanel, evGreenCar[0], evRedCar[0],  evHolICAR[0], evSabatCar[0], evEndShabat, evEndHol, evEndAckCar[0], evRedCarITCHOUL[0], evRedCarITCHOULAck[0], 1);

                                        evRedCar[0].sendEvent(0);

                                        intState = InState.MidA;
                                 //  }


                                    break;


                                case MidA:
if(tempC==0)
                                    getRedConfirationB();

                                    butt[2].setEnabled(true);
                                    butt[3].setEnabled(true);
                                    butt[5].setEnabled(true);
                                    butt[6].setEnabled(true);
                                    butt[8].setEnabled(true);
                                    butt[9].setEnabled(true);


//pepole-6,7,9,10,13

                                    if (evShabatB.arrivedEvent()) {
                                        System.out.println("שבת-קבוצה א");
                                        evShabatB.waitEvent();
                                        outState = OutState.Shabat;
                                        out = true;
                                        degelShabatA=1;
                                    }





                                    else if (evPressed.arrivedEvent())

                                    {


                                        data=(int)evPressed.waitEvent();
                                        System.out.println("מספר כפתור הוא: " + data);


                                        if(data==4||data==5||data==8||data==11||data==14||data==15)
                                        {


                                            new ShneyLuchot(ramzorim[4], tlf.myPanel, evGreen1[4], evRed1[4],  evHolIARR[4], evSabatPerson[4], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[4]);

                                            evGreen1[4].sendEvent();

                                            new ShneyLuchot(ramzorim[5], tlf.myPanel, evGreen1[5], evRed1[5],  evHolIARR[5], evSabatPerson[5], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[5]);

                                            evGreen1[5].sendEvent();

                                            new ShneyLuchot(ramzorim[6], tlf.myPanel, evGreen1[6], evRed1[6],  evHolIARR[6], evSabatPerson[6], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[6]);

                                            evRed1[6].sendEvent();

                                            new ShneyLuchot(ramzorim[7], tlf.myPanel, evGreen1[7], evRed1[7],  evHolIARR[7], evSabatPerson[7], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[7]);

                                            evRed1[7].sendEvent();

                                            new ShneyLuchot(ramzorim[9], tlf.myPanel, evGreen1[9], evRed1[9],  evHolIARR[9], evSabatPerson[9], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[9]);

                                            evRed1[9].sendEvent();


                                            new ShneyLuchot(ramzorim[10], tlf.myPanel, evGreen1[10], evRed1[10],  evHolIARR[10], evSabatPerson[10], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[10]);

                                            evRed1[10].sendEvent();


                                            new ShneyLuchot(ramzorim[12], tlf.myPanel, evGreen1[12], evRed1[12],  evHolIARR[12], evSabatPerson[12], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[12]);
                                            evRed1[12].sendEvent();


                                            new ShneyLuchot(ramzorim[13], tlf.myPanel, evGreen1[13], evRed1[13],  evHolIARR[13], evSabatPerson[13], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[13]);

                                            evRed1[13].sendEvent();

                                            System.out.println("עוברים מקבוצה א לקבוצה ב" );
                                            getRedConfirationKfiza();
                                           // System.out.println("state 3");
                                            temp=1;

                                            intState = InState.MidB;
                                            evENDpressed.sendEvent();
                                            butt[data-4].setEnabled( true );
                                            butt[data-4].setSelected(false);


                                           // butt[data-4].isSelected();
                                        }
                                    }

                                    else {
                                        new ShloshaAvot(ramzorim[1], tlf.myPanel, evGreenCar[1], evRedCar[1],  evHolICAR[1], evSabatCar[1], evEndShabat, evEndHol, evEndAckCar[1], evRedCarITCHOUL[1], evRedCarITCHOULAck[1], 2);
                                        evGreenCar[1].sendEvent();

                                        new ShneyLuchot(ramzorim[4], tlf.myPanel, evGreen1[4], evRed1[4],  evHolIARR[4], evSabatPerson[4], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[4]);

                                        evGreen1[4].sendEvent();

                                        new ShneyLuchot(ramzorim[5], tlf.myPanel, evGreen1[5], evRed1[5],  evHolIARR[5], evSabatPerson[5], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[5]);

                                        evGreen1[5].sendEvent();
                                        tempC=0;
                                        intState = InState.B;


                                    }



                                    break;

                                case B:
                                    butt[0].setEnabled(false);
                                    butt[1].setEnabled(false);
                                    butt[2].setEnabled(false);
                                    butt[3].setEnabled(false);
                                    butt[4].setEnabled(false);
                                    butt[5].setEnabled(false);
                                    butt[6].setEnabled(false);
                                    butt[7].setEnabled(false);
                                    butt[8].setEnabled(false);
                                    butt[9].setEnabled(false);
                                    butt[10].setEnabled(false);
                                    butt[11].setEnabled(false);



                                    System.out.println("אנחנו במצב B-יש אפשר לחצות את הצומת בבטחה!!!" );


                                    MyTimer72 mytimer3 = new MyTimer72(15000, evTime);
                                    evTime.waitEvent();
                                    //if (date=="A")
                                    //  {

/*
                                    if (evClick.arrivedEvent())
                                    {
                                        evClick.waitEvent();
                                        intState = InState.C;
                                    }
*/
/*

if (evPressed.arrivedEvent())

  {

      data = (int) evPressed.waitEvent();
      System.out.println("group B-     " + data);


      if (data == 0 || data == 6 || data == 7 || data == 9 || data == 10 || data == 12 || data == 13) {

          new ShloshaAvot(ramzorim[1], tlf.myPanel, evGreenCar[1], evRedCar[1], evHolICAR[1], evSabatCar[1], evEndShabat, evEndHol, evEndAckCar[1], evRedCarITCHOUL[1], evRedCarITCHOULAck[1], 2);
          evRedCar[1].sendEvent();

          new ShneyLuchot(ramzorim[4], tlf.myPanel, evGreen1[4], evRed1[4], evHolIARR[4], evSabatPerson[4], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[4]);

          evRed1[4].sendEvent();

          new ShneyLuchot(ramzorim[5], tlf.myPanel, evGreen1[5], evRed1[5], evHolIARR[5], evSabatPerson[5], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[5]);

          evRed1[5].sendEvent();


          System.out.println("finishB  " + data);
          getRedConfirationKfizaB();
          System.out.println("state 3");
          // tempB=1;
          tempB=1;

          intState = InState.Itchoul;
          evENDpressed.sendEvent();
          butt[data-4].setEnabled( true );
          butt[data-4].setSelected(false);
      }
  }*/



     // else {

      /*
          if (evPressed.arrivedEvent()) {

              data=(int)evPressed.waitEvent();
              evENDpressed.sendEvent();
              butt[data - 4].setEnabled(true);
              butt[data - 4].setSelected(false);

          }
*/

                       new ShloshaAvot(ramzorim[1], tlf.myPanel, evGreenCar[1], evRedCar[1], evHolICAR[0], evSabatCar[1], evEndShabat, evEndHol, evEndAckCar[1], evRedCarITCHOUL[1], evRedCarITCHOULAck[1], 2);
          evRedCar[1].sendEvent(0);

          new ShneyLuchot(ramzorim[6], tlf.myPanel, evGreen1[6], evRed1[6], evHolIARR[6], evSabatPerson[6], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[6]);
          evRed1[6].sendEvent(6);

          new ShneyLuchot(ramzorim[7], tlf.myPanel, evGreen1[7], evRed1[7], evHolIARR[7], evSabatPerson[7], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[7]);
          evRed1[7].sendEvent(7);

          new ShneyLuchot(ramzorim[9], tlf.myPanel, evGreen1[9], evRed1[9], evHolIARR[9], evSabatPerson[9], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[9]);
          evRed1[9].sendEvent(9);

          new ShneyLuchot(ramzorim[10], tlf.myPanel, evGreen1[10], evRed1[10], evHolIARR[10], evSabatPerson[10], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[10]);
          evRed1[10].sendEvent(10);

          new ShneyLuchot(ramzorim[12], tlf.myPanel, evGreen1[12], evRed1[12], evHolIARR[12], evSabatPerson[12], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[12]);
          evRed1[12].sendEvent(10);

          new ShneyLuchot(ramzorim[13], tlf.myPanel, evGreen1[13], evRed1[13], evHolIARR[13], evSabatPerson[13], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[13]);
          evRed1[13].sendEvent(13);


          intState = InState.MidB;

    //  }

                                    break;

                                case MidB:

                                   if(temp==0)
                                    getRedConfirationC();
                                    butt[0].setEnabled(true);
                                    butt[1].setEnabled(true);
                                    butt[2].setEnabled(true);
                                    butt[3].setEnabled(true);
                                    butt[4].setEnabled(true);
                                    butt[5].setEnabled(true);
                                    butt[6].setEnabled(true);
                                    butt[7].setEnabled(true);
                                    butt[8].setEnabled(true);
                                    butt[9].setEnabled(true);
                                    butt[10].setEnabled(true);
                                    butt[11].setEnabled(true);
//4,5
                                    if (evShabatB.arrivedEvent()) {
                                        System.out.println("שבת קבוצה ב");
                                        evShabatB.waitEvent();
                                        outState = OutState.Shabat;
                                        out = true;
                                        degelShabatB=1;

                                    }

                                    else {
                                        new ShloshaAvot(ramzorim[2], tlf.myPanel, evGreenCar[2], evRedCar[2],  evHolICAR[2], evSabatCar[2], evEndShabat, evEndHol, evEndAckCar[2], evRedCarITCHOUL[2], evRedCarITCHOULAck[2], 3);
                                        evGreenCar[2].sendEvent();

                                        new ShloshaAvot(ramzorim[3], tlf.myPanel, evGreenCar[3], evRedCar[3],  evHolICAR[3], evSabatCar[3], evEndShabat, evEndHol, evEndAckCar[3], evRedCarITCHOUL[3], evRedCarITCHOULAck[3], 4);
                                        evGreenCar[3].sendEvent();


                                        new ShneyLuchot(ramzorim[8], tlf.myPanel, evGreen1[8], evRed1[8],  evHolIARR[8], evSabatPerson[8], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[8]);

                                        evGreen1[8].sendEvent();


                                        new ShneyLuchot(ramzorim[11], tlf.myPanel, evGreen1[11], evRed1[11],  evHolIARR[11], evSabatPerson[11], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[11]);

                                        evGreen1[11].sendEvent();


                                        new ShneyLuchot(ramzorim[14], tlf.myPanel, evGreen1[14], evRed1[14],  evHolIARR[14], evSabatPerson[14], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[14]);
                                        evGreen1[14].sendEvent();


                                        new ShneyLuchot(ramzorim[15], tlf.myPanel, evGreen1[15], evRed1[15],  evHolIARR[15], evSabatPerson[15], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[15]);

                                        evGreen1[15].sendEvent();
                                        temp=0;

                                        intState = InState.C;

                                    }

                                    break;

                                case C:

                                    System.out.println("אנחנו במצב C-יש אפשר לחצות את הצומת בבטחה!!!" );
                                    butt[0].setEnabled(false);
                                    butt[1].setEnabled(false);
                                    butt[4].setEnabled(false);
                                    butt[7].setEnabled(false);
                                    butt[10].setEnabled(false);
                                    butt[11].setEnabled(false);


                                    MyTimer72 mytimer4 = new MyTimer72(15000,evTime);
                                   evTime.waitEvent();

/*
                                    if (evClick.arrivedEvent()) {
                                        evClick.waitEvent();
                                        intState = InState.C;
                                    }

*/




                                    new ShloshaAvot(ramzorim[2], tlf.myPanel, evGreenCar[2], evRedCar[2], evHolICAR[2], evSabatCar[2], evEndShabat, evEndHol, evEndAckCar[2],evRedCarITCHOUL[2],evRedCarITCHOULAck[2],3);
                                    evRedCar[2].sendEvent(0);

                                    new ShloshaAvot(ramzorim[3], tlf.myPanel, evGreenCar[3], evRedCar[3],  evHolICAR[3], evSabatCar[3], evEndShabat, evEndHol, evEndAckCar[3],evRedCarITCHOUL[3],evRedCarITCHOULAck[0],4);
                                    evRedCar[3].sendEvent(0);


                                    new ShneyLuchot(ramzorim[4], tlf.myPanel, evGreen1[4], evRed1[4],  evHolIARR[4], evSabatPerson[4], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[4]);

                                        evRed1[4].sendEvent(4);

                                        new ShneyLuchot(ramzorim[5], tlf.myPanel, evGreen1[5], evRed1[5],  evHolIARR[5], evSabatPerson[5], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[5]);

                                        evRed1[5].sendEvent(5);

                                        new ShneyLuchot(ramzorim[8], tlf.myPanel, evGreen1[8], evRed1[8],  evHolIARR[8], evSabatPerson[8], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[8]);

                                        evRed1[8].sendEvent(8);


                                        new ShneyLuchot(ramzorim[11], tlf.myPanel, evGreen1[11], evRed1[11],  evHolIARR[11], evSabatPerson[11], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[11]);

                                        evRed1[11].sendEvent(11);


                                        new ShneyLuchot(ramzorim[14], tlf.myPanel, evGreen1[14], evRed1[14],  evHolIARR[14], evSabatPerson[14], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[14]);
                                        evRed1[14].sendEvent(14);


                                        new ShneyLuchot(ramzorim[15], tlf.myPanel, evGreen1[15], evRed1[15],  evHolIARR[15], evSabatPerson[15], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[15]);

                                        evRed1[15].sendEvent(15);

                                        intState = InState.MidC;







             break;
                                case MidC:

                              getRedConfirationD();

                                    butt[0].setEnabled( true );
                                    butt[1].setEnabled( true );
                                    butt[4].setEnabled( true );
                                    butt[7].setEnabled( true );
                                    butt[10].setEnabled( true );
                                    butt[11].setEnabled( true );



                                    if (evShabatB.arrivedEvent())
                                    {
                                        System.out.println("שבת קבוצה ג" );
                                        evShabatB.waitEvent();
                                        outState=OutState.Shabat;
                                        out=true;
                                        degelShabatC=1;
                                    }

                               else if (evPressed.arrivedEvent())

                                    {

                                        data = (int) evPressed.waitEvent();
                                        System.out.println("כפתור מספר:" + data);


                                        if( data == 1 ||  data == 6 || data == 7 || data == 9 || data == 10 || data == 12 || data == 13 ) {


                                            new ShneyLuchot(ramzorim[6], tlf.myPanel, evGreen1[6], evRed1[6],  evHolIARR[6], evSabatPerson[6], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[6]);

                                            evGreen1[6].sendEvent();

                                            new ShneyLuchot(ramzorim[7], tlf.myPanel, evGreen1[7], evRed1[7],  evHolIARR[7], evSabatPerson[7], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[7]);

                                            evGreen1[7].sendEvent();

                                            new ShneyLuchot(ramzorim[9], tlf.myPanel, evGreen1[9], evRed1[9],  evHolIARR[9], evSabatPerson[9], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[9]);

                                            evGreen1[9].sendEvent();


                                            new ShneyLuchot(ramzorim[10], tlf.myPanel, evGreen1[10], evRed1[10],  evHolIARR[10], evSabatPerson[10], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[10]);

                                            evGreen1[10].sendEvent();


                                            new ShneyLuchot(ramzorim[12], tlf.myPanel, evGreen1[12], evRed1[12],  evHolIARR[12], evSabatPerson[12], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[12]);
                                            evGreen1[12].sendEvent();


                                            new ShneyLuchot(ramzorim[13], tlf.myPanel, evGreen1[13], evRed1[13],  evHolIARR[13], evSabatPerson[13], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[13]);

                                            evGreen1[13].sendEvent();


                                            System.out.println("עוברים מקבוצה ג לקבוצה ב");
                                            //getRedConfirationKfizaB();

                                            // tempB=1;
                                           tempC=1;

                                            intState = InState.MidA;
                                            evENDpressed.sendEvent();
                                            butt[data-4].setEnabled( true );
                                            butt[data-4].setSelected(false);


                                        }
                                    }

                                  else {
                                        new ShloshaAvot(ramzorim[0], tlf.myPanel, evGreenCar[0], evRedCar[0], evHolICAR[0], evSabatCar[0], evEndShabat, evEndHol, evEndAckCar[0], evRedCarITCHOUL[0], evRedCarITCHOULAck[0], 1);

                                        evGreenCar[0].sendEvent(1);

                                        new ShneyLuchot(ramzorim[6], tlf.myPanel, evGreen1[6], evRed1[6],  evHolIARR[6], evSabatPerson[6], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[6]);

                                        evGreen1[6].sendEvent();

                                        new ShneyLuchot(ramzorim[7], tlf.myPanel, evGreen1[7], evRed1[7],  evHolIARR[7], evSabatPerson[7], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[7]);

                                        evGreen1[7].sendEvent();

                                        new ShneyLuchot(ramzorim[9], tlf.myPanel, evGreen1[9], evRed1[9],  evHolIARR[9], evSabatPerson[9], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[9]);

                                        evGreen1[9].sendEvent();


                                        new ShneyLuchot(ramzorim[10], tlf.myPanel, evGreen1[10], evRed1[10],  evHolIARR[10], evSabatPerson[10], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[10]);

                                        evGreen1[10].sendEvent();


                                        new ShneyLuchot(ramzorim[12], tlf.myPanel, evGreen1[12], evRed1[12],  evHolIARR[12], evSabatPerson[12], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[12]);
                                        evGreen1[12].sendEvent();


                                        new ShneyLuchot(ramzorim[13], tlf.myPanel, evGreen1[13], evRed1[13],  evHolIARR[13], evSabatPerson[13], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[13]);

                                        evGreen1[13].sendEvent();

                                        intState = InState.A;
                                    }

                                    break;

                            }


           }

                    case Shabat:

                        System.out.println("נכנסנו לשבת-שבת שלום לכולם (: !" );


                        butt[0].setEnabled( false );
                        butt[1].setEnabled( false );
                        butt[2].setEnabled( false );
                        butt[3].setEnabled(false );
                        butt[4].setEnabled( false );
                        butt[5].setEnabled( false );

                        butt[6].setEnabled( false );
                        butt[7].setEnabled( false );
                        butt[8].setEnabled( false );
                        butt[9].setEnabled( false );
                        butt[10].setEnabled( false );
                        butt[11].setEnabled( false );

                        if(degelShabatA==1){

                            new ShneyLuchot(ramzorim[6], tlf.myPanel, evGreen1[6], evRed1[6],  evHolIARR[6], evSabatPerson[6], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[6]);
                            evRed1[6].sendEvent(6);

                            new ShneyLuchot(ramzorim[7], tlf.myPanel, evGreen1[7], evRed1[7],  evHolIARR[7], evSabatPerson[7], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[7]);
                            evRed1[7].sendEvent(7);

                            new ShneyLuchot(ramzorim[9], tlf.myPanel, evGreen1[9], evRed1[9],  evHolIARR[9], evSabatPerson[9], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[9]);
                            evRed1[9].sendEvent(9);

                            new ShneyLuchot(ramzorim[10], tlf.myPanel, evGreen1[10], evRed1[10],  evHolIARR[10], evSabatPerson[10], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[10]);
                            evRed1[10].sendEvent(10);

                            new ShneyLuchot(ramzorim[12], tlf.myPanel, evGreen1[12], evRed1[12],  evHolIARR[12], evSabatPerson[12], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[12]);
                            evRed1[12].sendEvent(12);

                            new ShneyLuchot(ramzorim[13], tlf.myPanel, evGreen1[13], evRed1[13],  evHolIARR[13], evSabatPerson[13], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[13]);
                            evRed1[13].sendEvent(13); degelShabatA=2;}

                         if(degelShabatB==1){  new ShneyLuchot(ramzorim[4], tlf.myPanel, evGreen1[4], evRed1[4],  evHolIARR[4], evSabatPerson[4], evEndGreen, evEndRed, evEndShabat, evEndHol,  evEndAck1[4]);
                            evRed1[4].sendEvent(4);

                            new ShneyLuchot(ramzorim[5], tlf.myPanel, evGreen1[5], evRed1[5],  evHolIARR[5], evSabatPerson[5], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[5]);
                            evRed1[5].sendEvent(5); degelShabatB=2;}
                         if(degelShabatC==1)
                           degelShabatC=2;

                        System.out.println("לפני מצב שבת-רמזורים אדומים" );

                        getRedConfirationShabat();


                        System.out.println("יש קיבלנו אישור- כל הרמזורים  אדומים" );

                        MyTimer72 mytimer9 = new MyTimer72(4000,evTime);
                        evTime.waitEvent();


                        new ShloshaAvot(ramzorim[0], tlf.myPanel, evGreenCar[0], evRedCar[0], evHolICAR[0], evSabatCar[0],  evEndShabat, evEndHol,  evEndAckCar[0],evRedCarITCHOUL[0],evRedCarITCHOULAck[0],1);
                        evSabatCar[0].sendEvent(1);

                        new ShloshaAvot(ramzorim[1], tlf.myPanel, evGreenCar[1], evRedCar[1], evHolICAR[1],  evSabatCar[1],  evEndShabat, evEndHol,  evEndAckCar[1],evRedCarITCHOUL[1],evRedCarITCHOULAck[1],2);
                        evSabatCar[1].sendEvent(1);

                        new ShloshaAvot(ramzorim[2], tlf.myPanel, evGreenCar[2], evRedCar[2],  evHolICAR[2], evSabatCar[2],  evEndShabat, evEndHol,  evEndAckCar[2],evRedCarITCHOUL[2],evRedCarITCHOULAck[2],3);
                        evSabatCar[2].sendEvent(1);

                        new ShloshaAvot(ramzorim[3], tlf.myPanel, evGreenCar[3], evRedCar[3], evHolICAR[3], evSabatCar[3],  evEndShabat, evEndHol,  evEndAckCar[3],evRedCarITCHOUL[3],evRedCarITCHOULAck[3],4);
                        evSabatCar[3].sendEvent(1);


                        new ShneyLuchot(ramzorim[4], tlf.myPanel, evGreen1[4], evRed1[4],  evHolIARR[4], evSabatPerson[4], evEndGreen, evEndRed, evEndShabat, evEndHol,  evEndAck1[4]);
                        evSabatPerson[4].sendEvent(4);

                        new ShneyLuchot(ramzorim[5], tlf.myPanel, evGreen1[5], evRed1[5],  evHolIARR[5], evSabatPerson[5], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[5]);
                        evSabatPerson[5].sendEvent(5);

                        new ShneyLuchot(ramzorim[6], tlf.myPanel, evGreen1[6], evRed1[6],  evHolIARR[6], evSabatPerson[6], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[6]);
                        evSabatPerson[6].sendEvent(6);

                        new ShneyLuchot(ramzorim[7], tlf.myPanel, evGreen1[7], evRed1[7],  evHolIARR[7], evSabatPerson[7], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[7]);
                        evSabatPerson[7].sendEvent(7);

                        new ShneyLuchot(ramzorim[8], tlf.myPanel, evGreen1[8], evRed1[8],  evHolIARR[8], evSabatPerson[8], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[8]);
                        evSabatPerson[8].sendEvent(8);

                        new ShneyLuchot(ramzorim[9], tlf.myPanel, evGreen1[9], evRed1[9],  evHolIARR[9], evSabatPerson[9], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[9]);
                        evSabatPerson[9].sendEvent(9);

                        new ShneyLuchot(ramzorim[10], tlf.myPanel, evGreen1[10], evRed1[10],  evHolIARR[10], evSabatPerson[10], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[10]);
                        evSabatPerson[10].sendEvent(10);

                        new ShneyLuchot(ramzorim[11], tlf.myPanel, evGreen1[11], evRed1[11], evHolIARR[11],evSabatPerson[11], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[11]);
                        evSabatPerson[11].sendEvent(11);

                        new ShneyLuchot(ramzorim[12], tlf.myPanel, evGreen1[12], evRed1[12],  evHolIARR[12], evSabatPerson[12], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[12]);
                        evSabatPerson[12].sendEvent(12);

                        new ShneyLuchot(ramzorim[13], tlf.myPanel, evGreen1[13], evRed1[13],  evHolIARR[13], evSabatPerson[13], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[13]);
                        evSabatPerson[13].sendEvent(13);

                        new ShneyLuchot(ramzorim[14], tlf.myPanel, evGreen1[14], evRed1[14],  evHolIARR[14], evSabatPerson[14], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[14]);
                        evSabatPerson[14].sendEvent(14);

                        new ShneyLuchot(ramzorim[15], tlf.myPanel, evGreen1[15], evRed1[15],  evHolIARR[15], evSabatPerson[15], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[15]);
                        evSabatPerson[15].sendEvent(15);

                       // getRedConfirationShabatAck();
                      // getRedConfirationShabatEND();
                      //  System.out.println("אחרי קבלת אק");



                        System.out.println("מחכים לבקשה לעבור למצב חול");
                            evHolI.waitEvent();



                            new ShloshaAvot(ramzorim[0], tlf.myPanel, evGreenCar[0], evRedCar[0], evHolICAR[0], evSabatCar[0],  evEndShabat, evEndHol,  evEndAckCar[0],evRedCarITCHOUL[0],evRedCarITCHOULAck[0],1);

                            evHolICAR[0].sendEvent(0);

                            new ShloshaAvot(ramzorim[1], tlf.myPanel, evGreenCar[1], evRedCar[1], evHolICAR[1],  evSabatCar[1],  evEndShabat, evEndHol,  evEndAckCar[1],evRedCarITCHOUL[1],evRedCarITCHOULAck[1],2);
                            evHolICAR[1].sendEvent(1);

                            new ShloshaAvot(ramzorim[2], tlf.myPanel, evGreenCar[2], evRedCar[2], evHolICAR[2], evSabatCar[2],  evEndShabat, evEndHol,  evEndAckCar[2],evRedCarITCHOUL[2],evRedCarITCHOULAck[2],3);
                            evHolICAR[2].sendEvent(2);

                            new ShloshaAvot(ramzorim[3], tlf.myPanel, evGreenCar[3], evRedCar[3], evHolICAR[3], evSabatCar[3],  evEndShabat, evEndHol,  evEndAckCar[3],evRedCarITCHOUL[3],evRedCarITCHOULAck[3],4);
                            evHolICAR[3].sendEvent(3);

                            new ShneyLuchot(ramzorim[4], tlf.myPanel, evGreen1[4], evRed1[4], evHolIARR[4], evSabatPerson[4], evEndGreen, evEndRed, evEndShabat, evEndHol,  evEndAck1[4]);
                            evHolIARR[4].sendEvent(4);

                            new ShneyLuchot(ramzorim[5], tlf.myPanel, evGreen1[5], evRed1[5], evHolIARR[5], evSabatPerson[5], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[5]);
                            evHolIARR[5].sendEvent(5);

                            new ShneyLuchot(ramzorim[6], tlf.myPanel, evGreen1[6], evRed1[6], evHolIARR[6], evSabatPerson[6], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[6]);
                            evHolIARR[6].sendEvent(6);

                            new ShneyLuchot(ramzorim[7], tlf.myPanel, evGreen1[7], evRed1[7], evHolIARR[7], evSabatPerson[7], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[7]);
                            evHolIARR[7].sendEvent(7);

                            new ShneyLuchot(ramzorim[8], tlf.myPanel, evGreen1[8], evRed1[8], evHolIARR[8], evSabatPerson[8], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[8]);
                            evHolIARR[8].sendEvent(8);

                            new ShneyLuchot(ramzorim[9], tlf.myPanel, evGreen1[9], evRed1[9], evHolIARR[9], evSabatPerson[9], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[9]);
                            evHolIARR[9].sendEvent(9);

                            new ShneyLuchot(ramzorim[10], tlf.myPanel, evGreen1[10], evRed1[10], evHolIARR[10], evSabatPerson[10], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[10]);
                            evHolIARR[10].sendEvent(10);

                            new ShneyLuchot(ramzorim[11], tlf.myPanel, evGreen1[11], evRed1[11], evHolIARR[11],evSabatPerson[11], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[11]);
                            evHolIARR[11].sendEvent(11);

                            new ShneyLuchot(ramzorim[12], tlf.myPanel, evGreen1[12], evRed1[12], evHolIARR[12], evSabatPerson[12], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[12]);
                            evHolIARR[12].sendEvent(12);

                            new ShneyLuchot(ramzorim[13], tlf.myPanel, evGreen1[13], evRed1[13], evHolIARR[13], evSabatPerson[13], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[13]);
                            evHolIARR[13].sendEvent(13);

                            new ShneyLuchot(ramzorim[14], tlf.myPanel, evGreen1[14], evRed1[14], evHolIARR[14], evSabatPerson[14], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[14]);
                            evHolIARR[14].sendEvent(14);

                            new ShneyLuchot(ramzorim[15], tlf.myPanel, evGreen1[15], evRed1[15], evHolIARR[15], evSabatPerson[15], evEndGreen, evEndRed, evEndShabat, evEndHol, evEndAck1[15]);
                            evHolIARR[15].sendEvent(15);


                        getRedConfirationShabatEND();
                        System.out.println("יש קיבלנו אישור למצב חול-סוף סוף נגמר שבת" );
                        butt[0].setEnabled( true );
                        butt[1].setEnabled( true );
                        butt[2].setEnabled( true );
                        butt[3].setEnabled(true );
                        butt[4].setEnabled( true );
                        butt[5].setEnabled( true );

                        butt[6].setEnabled( true );
                        butt[7].setEnabled( true);
                        butt[8].setEnabled(true );
                        butt[9].setEnabled( true);
                        butt[10].setEnabled( true );
                        butt[11].setEnabled( true );


                            outState = OutState.Hol;
                            intState = InState.BItchoul;
                            out=false;




                        System.out.println("יאלה חוזרים לאתחולללללל" );
                       // MyTimer72 mytimer17 = new MyTimer72(5000, evTime);
                       // evTime.waitEvent();



break;




        }
        }

        //catch (InterruptedException e) {
        //}

                   }


   // }




        public static void main (String[]args){

        BuildTrafficLight buildtrafficLight = new BuildTrafficLight();
            buildtrafficLight.init();
        ;
    }
    }



