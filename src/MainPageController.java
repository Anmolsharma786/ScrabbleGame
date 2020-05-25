import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.util.ArrayList;


import static java.lang.String.*;

public class MainPageController {
    ArrayList<Label> label = new ArrayList<Label>();
    ArrayList<Button> btn = new ArrayList<Button>();
    @FXML
    private Label previousWord, totalPoints,error;
    @FXML
    private TextField currentWord;
    @FXML
    private Button btnQ,btnE,btnA,btnB,btnC,btnD,btnF,btnG,btnH,btnI,btnJ,btnK,btnL,btnM,btnN,btnO,btnP,btnR,btnS,btnT,btnU,btnV,btnW,btnX,btnY,btnZ;
    int comm = 0;
    @FXML
    private Label labelA,labelQ,labelB,labelC,labelD,labelE,labelF,labelG,labelH,labelI,labelJ,labelK,labelL,labelM,labelN,labelO,labelP,labelR,labelS,labelT,labelU,labelV,labelW,labelX,labelY,labelZ;
    boolean evaluator=true;

    @FXML
    private void initialize(){
        // ******* Adding the Labels to the ArrayList *******
        label.add(labelA);
        label.add(labelB);
        label.add(labelC);
        label.add(labelD);
        label.add(labelE);
        label.add(labelF);
        label.add(labelG);
        label.add(labelH);
        label.add(labelI);
        label.add(labelJ);
        label.add(labelK);
        label.add(labelL);
        label.add(labelM);
        label.add(labelN);
        label.add(labelO);
        label.add(labelP);
        label.add(labelQ);
        label.add(labelR);
        label.add(labelS);
        label.add(labelT);
        label.add(labelU);
        label.add(labelV);
        label.add(labelW);
        label.add(labelX);
        label.add(labelY);
        label.add(labelZ);

        // ******* Adding the Buttons to the ArrayList *******
        btn.add(btnA);
        btn.add(btnB);
        btn.add(btnC);
        btn.add(btnD);
        btn.add(btnE);
        btn.add(btnF);
        btn.add(btnG);
        btn.add(btnH);
        btn.add(btnI);
        btn.add(btnJ);
        btn.add(btnK);
        btn.add(btnL);
        btn.add(btnM);
        btn.add(btnN);
        btn.add(btnO);
        btn.add(btnP);
        btn.add(btnQ);
        btn.add(btnR);
        btn.add(btnS);
        btn.add(btnT);
        btn.add(btnU);
        btn.add(btnV);
        btn.add(btnW);
        btn.add(btnX);
        btn.add(btnY);
        btn.add(btnZ);

    }

    public void SubmitClicked(ActionEvent actionEvent) {
        error.setText("");
        MainPageModel mpm = new MainPageModel();

        if(mpm.currentWords(currentWord.getText(),totalPoints.getText(),evaluator)==true){
            previousWord.setText(MainPageModel.previousWord(previousWord.getText(),currentWord.getText(),comm));
            totalPoints.setText(String.valueOf(MainPageModel.totalScore(currentWord.getText())));
            currentWord.setText("");
            comm++;

        }
        else{
            error.setText(MainPageModel.error());
        }
    }

    public void buttonClickedA() {
        System.out.println("in button a");
                currentWord.setText(currentWord.getText() + "A");
                int i = Integer.parseInt(labelA.getText());
                if (i > 0) {
                    labelA.setText(valueOf(i - 1));
                }
                if (i <= 0) {
                    evaluator = false;
                    btnA.setOpacity(0);
                }

    }

    public void buttonClickedB(ActionEvent actionEvent) {
            currentWord.setText(currentWord.getText() + "B");
            int i = Integer.parseInt(labelB.getText());
            if (i > 0) {
                labelB.setText(valueOf(i - 1));
            }
            if (i <= 0) {
                evaluator = false;
                btnB.setOpacity(0);
            }

    }
    public void buttonClickedC(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"C");
        int i = Integer.parseInt(labelC.getText());
        if(i>0) {
            labelC.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnC.setOpacity(0);
        }
    }

    public void buttonClickedD(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"D");
        int i = Integer.parseInt(labelD.getText());
        if(i>0) {
            labelD.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnD.setOpacity(0);
        }
    }

    public void buttonClickedE(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"E");
        int i = Integer.parseInt(labelE.getText());
        if(i>0) {
            labelE.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnE.setOpacity(0);
        }
    }

    public void buttonClickedF(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"F");
        int i = Integer.parseInt(labelF.getText());
        if(i>0) {
            labelF.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnF.setOpacity(0);
        }
    }

    public void buttonClickedG(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"G");

        int i = Integer.parseInt(labelG.getText());
        if(i>0) {
            labelG.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnG.setOpacity(0);
        }
    }

    public void buttonClickedH(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"H");
        int i = Integer.parseInt(labelH.getText());
        if(i>0) {
            labelH.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnH.setOpacity(0);
        }
    }

    public void buttonClickedI(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"I");
        int i = Integer.parseInt(labelI.getText());
        if(i>0) {
            labelI.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnI.setOpacity(0);
        }
    }

    public void buttonClickedJ(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"J");
        int i = Integer.parseInt(labelJ.getText());
        if(i>0) {
            labelJ.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnJ.setOpacity(0);
        }
    }

    public void buttonClickedK(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"K");
        int i = Integer.parseInt(labelK.getText());
        if(i>0) {
            labelK.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnK.setOpacity(0);
        }
    }

    public void buttonClickedM(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"M");
        int i = Integer.parseInt(labelM.getText());
        if(i>0) {
            labelM.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnM.setOpacity(0);
        }
    }

    public void buttonClickedL(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"L");
        int i = Integer.parseInt(labelL.getText());
        if(i>0) {
            labelL.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnL.setOpacity(0);
        }
    }

    public void buttonClickedN(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"N");
        int i = Integer.parseInt(labelN.getText());
        if(i>0) {
            labelN.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnN.setOpacity(0);
        }
    }

    public void buttonClickedO(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"AO");
        int i = Integer.parseInt(labelO.getText());
        if(i>0) {
            labelO.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnO.setOpacity(0);
        }
    }

    public void buttonClickedU(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"U");
        int i = Integer.parseInt(labelU.getText());
        if(i>0) {
            labelU.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnU.setOpacity(0);
        }
    }

    public void buttonClickedQ(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"Q");
        int i = Integer.parseInt(labelQ.getText());
        if(i>0) {
            labelQ.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnQ.setOpacity(0);
        }
    }

    public void buttonClickedR(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"R");
        int i = Integer.parseInt(labelR.getText());
        if(i>0) {
            labelR.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnR.setOpacity(0);
        }
    }

    public void buttonClickedS(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"S");
        int i = Integer.parseInt(labelS.getText());
        if(i>0) {
            labelS.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnS.setOpacity(0);
        }
    }

    public void buttonClickedP(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"P");
        int i = Integer.parseInt(labelP.getText());
        if(i>0) {
            labelP.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnP.setOpacity(0);
        }
    }

    public void buttonClickedX(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"X");
        int i = Integer.parseInt(labelX.getText());
        if(i>0) {
            labelX.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnX.setOpacity(0);
        }
    }

    public void buttonClickedT(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"T");
        int i = Integer.parseInt(labelT.getText());
        if(i>0) {
            labelT.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnT.setOpacity(0);
        }
    }

    public void buttonClickedW(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"W");
        int i = Integer.parseInt(labelW.getText());
        if(i>0) {
            labelW.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnW.setOpacity(0);
        }
    }

    public void buttonClickedZ(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"Z");
        int i = Integer.parseInt(labelZ.getText());
        if(i>0) {
            labelZ.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnZ.setOpacity(0);
        }
    }

    public void buttonClickedY(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"Y");
        int i = Integer.parseInt(labelY.getText());
        if(i>0) {
            labelY.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnY.setOpacity(0);
        }
    }

    public void buttonClickedV(ActionEvent actionEvent) {
        currentWord.setText(currentWord.getText()+"V");
        int i = Integer.parseInt(labelV.getText());
        if(i>0) {
            labelV.setText(valueOf(i - 1));
        }
        if(i<=0) {
            evaluator = false;
            btnV.setOpacity(0);
        }
    }


    // if you want to know the rules of the game. go to this page
    public void RulesClicked(ActionEvent actionEvent) {
        try{
            // by this you can change the windows
            new WindowChanger().newWindow("Rules","GAME RULES",false);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void keyPressed(KeyEvent keyEvent) {
        String c = keyEvent.getCode().getName();
        boolean result= MainPageModel.textChange(this.label,c,this.btn);
        if(result==false){
            evaluator=false;
            System.out.println(evaluator);
        }
        else{
            evaluator=result;

        }
        }

}

