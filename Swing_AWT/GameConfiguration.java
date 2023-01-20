package Swing_AWT;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;

public class GameConfiguration extends JFrame implements ActionListener {

    Sudoku_Board boards;
    private Font font;
    private JPanel gamePanel;
    //create 9 panel 3 Row-wie and 3 column-Wise
    private JPanel sub3by3Panel1;
    private JPanel sub3by3Panel2;
    private JPanel sub3by3Panel3;
    private JPanel sub3by3Panel4;
    private JPanel sub3by3Panel5;
    private JPanel sub3by3Panel6;
    private JPanel sub3by3Panel7;
    private JPanel sub3by3Panel8;
    private JPanel sub3by3Panel9;
    //create 81 textField (9*9) for taking input values
    private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12, tf13, tf14, tf15, tf16,
                        tf17, tf18, tf19, tf20, tf21, tf22, tf23, tf24, tf25, tf26 , tf27, tf28, tf29, tf30,
                        tf31, tf32, tf33, tf34, tf35, tf36 , tf37, tf38, tf39, tf40, tf41, tf42, tf43, tf44,
                        tf45, tf46 , tf47, tf48, tf49, tf50, tf51, tf52, tf53, tf54, tf55, tf56 , tf57, tf58,
                        tf59, tf60, tf61, tf62, tf63, tf64, tf65, tf66, tf67, tf68, tf69, tf70, tf71, tf72, tf73,
                        tf74,tf75, tf76, tf77, tf78, tf79, tf80, tf81;
    private JButton newGame;

    //Create JTextField Typed array for each of the 9 panel --> To take input
    private JTextField[] subPanel1JTF;
    private JTextField[] subPanel2JTF;
    private JTextField[] subPanel3JTF;
    private JTextField[] subPanel4JTF;
    private JTextField[] subPanel5JTF;
    private JTextField[] subPanel6JTF;
    private JTextField[] subPanel7JTF;
    private JTextField[] subPanel8JTF;
    private JTextField[] subPanel9JTF;

    /*  This 2d array store previously some key and that key should be matches with newly Release keyEvent
     means--> that key actually work in "findIndexFor_Row_Col()" function
     */
    JTextField [][] JTF2dArray;
    GameConfiguration()
    {
        font = new Font(Font.SERIF, Font.BOLD, 36);


        tf1 = constructJTF(tf1);
        tf2 = constructJTF(tf2);
        tf3 = constructJTF(tf3);
        tf4 = constructJTF(tf4);
        tf5 = constructJTF(tf5);
        tf6 = constructJTF(tf6);
        tf7 = constructJTF(tf7);
        tf8 = constructJTF(tf8);
        tf9 = constructJTF(tf9);
        tf10 = constructJTF(tf10);
        tf11 = constructJTF(tf11);
        tf12 = constructJTF(tf12);
        tf13 = constructJTF(tf13);
        tf14 = constructJTF(tf14);
        tf15 = constructJTF(tf15);
        tf16 = constructJTF(tf16);
        tf17 = constructJTF(tf17);
        tf18 = constructJTF(tf18);
        tf19 = constructJTF(tf19);
        tf20 = constructJTF(tf20);
        tf21 = constructJTF(tf21);
        tf22 = constructJTF(tf22);
        tf23 = constructJTF(tf23);
        tf24 = constructJTF(tf24);
        tf25 = constructJTF(tf25);
        tf26 = constructJTF(tf26);
        tf27 = constructJTF(tf27);
        tf28 = constructJTF(tf28);
        tf29 = constructJTF(tf29);
        tf30 = constructJTF(tf30);
        tf31 = constructJTF(tf31);
        tf32 = constructJTF(tf32);
        tf33 = constructJTF(tf33);
        tf34 = constructJTF(tf34);
        tf35 = constructJTF(tf35);
        tf36 = constructJTF(tf36);
        tf37 = constructJTF(tf37);
        tf38 = constructJTF(tf38);
        tf39 = constructJTF(tf39);
        tf40 = constructJTF(tf40);
        tf41 = constructJTF(tf41);
        tf42 = constructJTF(tf42);
        tf43 = constructJTF(tf43);
        tf44 = constructJTF(tf44);
        tf45 = constructJTF(tf45);
        tf46 = constructJTF(tf46);
        tf47 = constructJTF(tf47);
        tf48 = constructJTF(tf48);
        tf49 = constructJTF(tf49);
        tf50 = constructJTF(tf50);
        tf51 = constructJTF(tf51);
        tf52 = constructJTF(tf52);
        tf53 = constructJTF(tf53);
        tf54 = constructJTF(tf54);
        tf55 = constructJTF(tf55);
        tf56 = constructJTF(tf56);
        tf57 = constructJTF(tf57);
        tf58 = constructJTF(tf58);
        tf59 = constructJTF(tf59);
        tf60 = constructJTF(tf60);
        tf61 = constructJTF(tf61);
        tf62 = constructJTF(tf62);
        tf63 = constructJTF(tf63);
        tf64 = constructJTF(tf64);
        tf65 = constructJTF(tf65);
        tf66 = constructJTF(tf66);
        tf67 = constructJTF(tf67);
        tf68 = constructJTF(tf68);
        tf69 = constructJTF(tf69);
        tf70 = constructJTF(tf70);
        tf71 = constructJTF(tf71);
        tf72 = constructJTF(tf72);
        tf73 = constructJTF(tf73);
        tf74 = constructJTF(tf74);
        tf75 = constructJTF(tf75);
        tf76 = constructJTF(tf76);
        tf77 = constructJTF(tf77);
        tf78 = constructJTF(tf78);
        tf79 = constructJTF(tf79);
        tf80 = constructJTF(tf80);
        tf81 = constructJTF(tf81);

        sub3by3Panel1 = addJTFtoPanel(1, sub3by3Panel1, tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9);
        sub3by3Panel2 = addJTFtoPanel(2, sub3by3Panel2, tf10, tf11, tf12, tf13, tf14, tf15, tf16, tf17, tf18);
        sub3by3Panel3 = addJTFtoPanel(3, sub3by3Panel3, tf19, tf20, tf21, tf22, tf23, tf24, tf25, tf26, tf27);
        sub3by3Panel4 = addJTFtoPanel(4, sub3by3Panel4, tf28, tf29, tf30, tf31, tf32, tf33, tf34, tf35, tf36);
        sub3by3Panel5 = addJTFtoPanel(5, sub3by3Panel5, tf37, tf38, tf39, tf40, tf41, tf42, tf43, tf44, tf45);
        sub3by3Panel6 = addJTFtoPanel(6, sub3by3Panel6, tf46, tf47, tf48, tf49, tf50, tf51, tf52, tf53, tf54);
        sub3by3Panel7 = addJTFtoPanel(7, sub3by3Panel7, tf55, tf56, tf57, tf58, tf59, tf60, tf61, tf62, tf63);
        sub3by3Panel8 = addJTFtoPanel(8, sub3by3Panel8, tf64, tf65, tf66, tf67, tf68, tf69, tf70, tf71, tf72);
        sub3by3Panel9 = addJTFtoPanel(9, sub3by3Panel9, tf73, tf74, tf75, tf76, tf77, tf78, tf79, tf80, tf81);


        JTF2dArray = new JTextField[][]{
                {tf1, tf2, tf3,      tf10, tf11, tf12,   tf19, tf20, tf21},
                {tf4, tf5, tf6,      tf13, tf14, tf15,   tf22, tf23, tf24},
                {tf7, tf8, tf9,      tf16, tf17, tf18,   tf25, tf26, tf27},
                {tf28, tf29, tf30,   tf37, tf38, tf39,   tf46, tf47, tf48},
                {tf31, tf32, tf33,   tf40, tf41, tf42,   tf49, tf50, tf51},
                {tf34, tf35, tf36,   tf43, tf44, tf45,   tf52, tf53, tf54},
                {tf55, tf56, tf57,   tf64, tf65, tf66,   tf73, tf74, tf75},
                {tf58, tf59, tf60,   tf67, tf68, tf69,   tf76, tf77, tf78},
                {tf61, tf62, tf63,   tf70, tf71, tf72,   tf79, tf80, tf81},
        };


        newGame = new JButton("New Game");
        newGame.addActionListener(this);

        //=================to show output=================
        gamePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 3, 3));
        gamePanel.add(sub3by3Panel1);
        gamePanel.add(sub3by3Panel2);
        gamePanel.add(sub3by3Panel3);
        gamePanel.add(sub3by3Panel4);
        gamePanel.add(sub3by3Panel5);
        gamePanel.add(sub3by3Panel6);
        gamePanel.add(sub3by3Panel7);
        gamePanel.add(sub3by3Panel8);
        gamePanel.add(sub3by3Panel9);

        gamePanel.add(newGame);

        /* After add all the component to gamePane then we have to add gamepane to containpain
        to showing total window output */
        getContentPane().add(gamePanel);

        setVisible(true);
        setSize(500,600);
        setResizable(false);
        setTitle("Sudoku Project");
        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
    }


    private JPanel addJTFtoPanel(int subPanelNo, JPanel subPanel, JTextField TF1, JTextField TF2,
                                 JTextField TF3, JTextField TF4, JTextField TF5, JTextField TF6,
                                 JTextField TF7, JTextField TF8, JTextField TF9)
    {
        switch (subPanelNo){
            case 1: subPanel1JTF = new JTextField[]{TF1, TF2, TF3, TF4, TF5, TF6, TF7, TF8, TF9};
                    break;
            case 2: subPanel2JTF = new JTextField[]{TF1, TF2, TF3, TF4, TF5, TF6, TF7, TF8, TF9};
                    break;
            case 3: subPanel3JTF = new JTextField[]{TF1, TF2, TF3, TF4, TF5, TF6, TF7, TF8, TF9};
                    break;
            case 4: subPanel4JTF = new JTextField[]{TF1, TF2, TF3, TF4, TF5, TF6, TF7, TF8, TF9};
                    break;
            case 5: subPanel5JTF = new JTextField[]{TF1, TF2, TF3, TF4, TF5, TF6, TF7, TF8, TF9};
                    break;
            case 6: subPanel6JTF = new JTextField[]{TF1, TF2, TF3, TF4, TF5, TF6, TF7, TF8, TF9};
                    break;
            case 7: subPanel7JTF = new JTextField[]{TF1, TF2, TF3, TF4, TF5, TF6, TF7, TF8, TF9};
                    break;
            case 8: subPanel8JTF = new JTextField[]{TF1, TF2, TF3, TF4, TF5, TF6, TF7, TF8, TF9};
                    break;
            case 9: subPanel9JTF = new JTextField[]{TF1, TF2, TF3, TF4, TF5, TF6, TF7, TF8, TF9};
                    break;
        }
        subPanel = new JPanel(new GridLayout(3,3,2,2));
        subPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE,2));
        subPanel.add(TF1);
        subPanel.add(TF2);
        subPanel.add(TF3);
        subPanel.add(TF4);
        subPanel.add(TF5);
        subPanel.add(TF6);
        subPanel.add(TF7);
        subPanel.add(TF8);
        subPanel.add(TF9);

        return subPanel;
    }


    /* Initialise constructJTF for 81 textFields and each text-fields will be interfaced of
     keyListener like keypressed, keyrelease....
     */
    private JTextField constructJTF(JTextField jtf_1_81)
    {
        //Make css of each textField
        jtf_1_81 = new JTextField();
        jtf_1_81.setPreferredSize(new Dimension(50,50));
        jtf_1_81.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        jtf_1_81.setHorizontalAlignment(JTextField.CENTER);
        jtf_1_81.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        // Make keyListiner to each textfield
        /*Its rectify which valid button everytime user pressed as well as relished
        * KeyListener is an Interface so that why we do not have any option to create KeyListener() Object
        * so we do Inner class of KeyListener */
        KeyListener keyListener = new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
                // TypeCasting from object to textField
                JTextField jtf = (JTextField) e.getSource();

                if(!isValidCharacter(e) && e.getKeyCode() != KeyEvent.VK_BACK_SPACE){
                    jtf.setEditable(false);
                    System.out.print("Not Valid Character");
                }
                else{
                    jtf.setText("");
                    jtf.setEditable(true);
                }

            }
            int[] findIndexFor_Row_Col(JTextField jtf){
                int[] result = {-1,-1};
                for(int i=0;i<9;i++){
                    for(int j=0;j<9;j++){
                        if(jtf.equals(JTF2dArray[i][j])){
                            result[0] = i;
                            result[1] = j;
                            return result;
                        }
                    }
                }
                return result;
            }
            @Override
            public void keyReleased(KeyEvent e) {
                JTextField jtf = (JTextField) e.getSource();
                int[] JTFIndexValue = findIndexFor_Row_Col(jtf); //from here we got row and col value

                int row = JTFIndexValue[0];
                int col = JTFIndexValue[1];

                String valueInputted = "" + e.getKeyChar();//typeCasting to String

                if(isValidCharacter(e) && e.getKeyCode() != KeyEvent.VK_BACK_SPACE)
                {
                    resetJTFColor();
                    restrictAllJTFAccessButFocused(row, col, true);
                    restrictGeneratedJTFAccess(boards);

                    // For checking Duplicate Key
                    // row-wise true/false return
                    boolean areRowDuplicate = rowDuplicateChecking(JTF2dArray[row], jtf, valueInputted);
                    //column wise true/false return
                    boolean areColsDuplicate = colsDuplicateChecking(col, jtf, valueInputted);
                    //and also inside each subpanel or 3*3 box --> return true/false
                    boolean areBoxDuplicate = boxDuplicateChecking(row, col, jtf, valueInputted);


                    if(areRowDuplicate || areBoxDuplicate || areColsDuplicate){
                        // Make duplicate key border should be RED...
                        setJTFColorAsRed(areBoxDuplicate, areRowDuplicate, areColsDuplicate, valueInputted, row, col);
                        //Make Wrong key also Editable except preSet value that's given in Sudoku Board
                        restrictAllJTFAccessButFocused(row, col, false);
                    }
                    else{
                        if(isValidCharacter(e)) JTF2dArray[row][col].setText(valueInputted);
                        else if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
                            JTF2dArray[row][col].setText("");
                        }
                    }
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {

            }
        };
        jtf_1_81.addKeyListener(keyListener);
        return jtf_1_81;
    }

    /*==============Reset Color from RED to WHITE=====================*/
    private void resetJTFColor(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                JTF2dArray[i][j].setBackground(Color.WHITE);
            }
        }
    }
    /*================END function=================================*/

    boolean isValidCharacter(KeyEvent e){
        int input = Character.getNumericValue(e.getKeyChar());
        if(input > 0 && input <= 9) return true;
        return false;
    }


    /*--------If i enter wrong button it should be Editable and preSet value is not editable-------------------*/
    private void restrictAllJTFAccessButFocused(int row, int col, boolean correctVal)
    {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(correctVal) JTF2dArray[i][j].setEditable(true);
                else{
                    if(!(i==row && j==col)) JTF2dArray[i][j].setEditable(false);
                }
            }
        }
    }
    /*-------------------------------End Method---------------------------------------------------------*/


    /*===If any key empty only that part should be editable-> true, ====*/
    /*========Otherwise it insert to board and we can't Edit=======================*/
    private void restrictGeneratedJTFAccess(Sudoku_Board boards)
    {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(boards.getFinalBoard()[i][j] == 0) JTF2dArray[i][j].setEditable(true);
                else{
                    JTF2dArray[i][j].setText(""+ boards.getFinalBoard()[i][j]);
                    JTF2dArray[i][j].setEditable(false);
                }
            }
        }
    }
    /*====================End Methods====================================*/


    /*=====This method only help us to finding perfect box/subPanel Number where duplicate Key actually staying===============*/
    private JTextField[] flattenBoxToRow(int row, int col)
    {
        if(row < 3){
            if(col < 3) return subPanel1JTF;
            else if(col < 6) return subPanel2JTF;
            else return subPanel3JTF;
        }
        else if(row < 6){
            if(col < 3) return subPanel4JTF;
            else if(col < 6) return subPanel5JTF;
            else return subPanel6JTF;
        }
        else{
            if(col < 3) return subPanel7JTF;
            else if(col < 6) return subPanel8JTF;
            else return subPanel9JTF;
        }
    }
    /*=============================End portion======================================================*/


    /*=======Checking Duplicate Key as ROW-WISE, COLUMN WISE AS WELL AS inside BOX===================*/
    /*That Duplicate Present or Not*/
    private boolean rowDuplicateChecking(JTextField[] row, JTextField keyPressed, String value)
    {
        for(JTextField element : row){
            if(element != keyPressed ){
                if(element.getText().equals(value)) return true;
            }
        }
        return false;
    }
    private boolean colsDuplicateChecking(int cols, JTextField keyPressed, String value)
    {
        for(int i=0;i<9;i++){
            //first its checking key-filder where we user choose that text-filder and that area
            //check for rows cols equivalent or not
            if(!JTF2dArray[i][cols].equals(keyPressed)){
                // After pressed key value is equal or not with preSetted key
                if(JTF2dArray[i][cols].getText().equals(value)) return true;
            }
        }
        return false;
    }
    //If i checking only in BOx/SubPanel that time only check key by row wise
    private boolean boxDuplicateChecking(int row, int cols, JTextField keyPressed, String value)
    {
        return rowDuplicateChecking(flattenBoxToRow(row, cols), keyPressed,value);
    }
    /*========================End Method==========================================*/


    //========================== Color Red BackGround For Duplicate KeyEvents=================================
    void setJTFColorAsRed(boolean areBoxDuplicate, boolean areRowDuplicate, boolean areColsDuplicate,
                     String valueInputted, int row, int col)
    {
        //for Box Duplicate
        if(areBoxDuplicate){
            for(JTextField element : flattenBoxToRow(row, col)){
                if(element.getText().equals(valueInputted)){
                    element.setBackground(Color.RED);
                }
            }
        }
        //For Row Duplicate
        if(areRowDuplicate){
            for(JTextField element : JTF2dArray[row]){
                if(element.getText().equals(valueInputted)) element.setBackground(Color.RED);
            }
        }
        //For Column Duplicate
        if(areColsDuplicate){
            for(int i=0;i<9; i++){
                if(JTF2dArray[i][col].getText().equals(valueInputted))
                    JTF2dArray[i][col].setBackground(Color.RED);
            }
        }
    }
    /*===========End Of this Duplicate Methods============================================*/

    @Override
    public void actionPerformed(ActionEvent e) {
        boards = new Sudoku_Board();
        clearJTextFields();
        resetJTFColor();
        restrictGeneratedJTFAccess(boards);
    }

    private void clearJTextFields(){
        for(JTextField[] element2DArray : JTF2dArray){
            for(JTextField element : element2DArray){
                element.setText("");
            }
        }
    }
}
