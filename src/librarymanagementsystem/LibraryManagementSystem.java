package librarymanagementsystem;

import java.io.File;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author cindy
 */
public class LibraryManagementSystem {
    
    public static void main(String[] args) throws IOException{
        //scan database and set up
        File logintest=new File("C:\\JavaOOP\\project\\logintest.txt");
        Scanner file=new Scanner(logintest);
        String[][] loginarr=new String[14][3];
        while(file.hasNext()){
            for(int i=0;i<14;i++){
                for(int j=0;j<3;j++){
                    loginarr[i][j]=file.next();
                }
            }
        }

        ArrayList<Object> users=new ArrayList();
        users.add(new login(loginarr[0][0],loginarr[0][1],loginarr[0][2]));
        users.add(new login(loginarr[1][0],loginarr[1][1],loginarr[1][2]));
        users.add(new login(loginarr[2][0],loginarr[2][1],loginarr[2][2]));
        users.add(new login(loginarr[3][0],loginarr[3][1],loginarr[3][2]));
        users.add(new login(loginarr[4][0],loginarr[4][1],loginarr[4][2]));
        users.add(new login(loginarr[5][0],loginarr[5][1],loginarr[5][2]));
        users.add(new login(loginarr[6][0],loginarr[6][1],loginarr[6][2]));
        users.add(new login(loginarr[7][0],loginarr[7][1],loginarr[7][2]));
        users.add(new login(loginarr[8][0],loginarr[8][1],loginarr[8][2]));
        users.add(new login(loginarr[9][0],loginarr[9][1],loginarr[9][2]));
        users.add(new login(loginarr[10][0],loginarr[10][1],loginarr[10][2]));
        users.add(new login(loginarr[11][0],loginarr[11][1],loginarr[11][2]));
        users.add(new login(loginarr[12][0],loginarr[12][1],loginarr[12][2]));
        users.add(new login(loginarr[13][0],loginarr[13][1],loginarr[13][2]));
        
        File booktest= new File("C:\\JavaOOP\\project\\booktest.txt");
        Scanner file2= new Scanner(booktest);
        String[][] bookarr=new String[20][10];
        while(file2.hasNext()){
            for(int i=0;i<20;i++){
                for(int j=0;j<10;j++){
                    bookarr[i][j]=file2.next();
                }
            }
        }
        
        ArrayList<Object> books=new ArrayList();
        books.add(new bookshelf(bookarr[0][0],bookarr[0][1],bookarr[0][2],bookarr[0][3],bookarr[0][4],bookarr[0][5],bookarr[0][6],bookarr[0][7],bookarr[0][8],bookarr[0][9]));
        books.add(new bookshelf(bookarr[1][0],bookarr[1][1],bookarr[1][2],bookarr[1][3],bookarr[1][4],bookarr[1][5],bookarr[1][6],bookarr[1][7],bookarr[1][8],bookarr[1][9]));
        books.add(new bookshelf(bookarr[2][0],bookarr[2][1],bookarr[2][2],bookarr[2][3],bookarr[2][4],bookarr[2][5],bookarr[2][6],bookarr[2][7],bookarr[2][8],bookarr[2][9]));
        books.add(new bookshelf(bookarr[3][0],bookarr[3][1],bookarr[3][2],bookarr[3][3],bookarr[3][4],bookarr[3][5],bookarr[3][6],bookarr[3][7],bookarr[3][8],bookarr[3][9]));
        books.add(new bookshelf(bookarr[4][0],bookarr[4][1],bookarr[4][2],bookarr[4][3],bookarr[4][4],bookarr[4][5],bookarr[4][6],bookarr[4][7],bookarr[4][8],bookarr[4][9]));
        books.add(new bookshelf(bookarr[5][0],bookarr[5][1],bookarr[5][2],bookarr[5][3],bookarr[5][4],bookarr[5][5],bookarr[5][6],bookarr[5][7],bookarr[5][8],bookarr[5][9]));
        books.add(new bookshelf(bookarr[6][0],bookarr[6][1],bookarr[6][2],bookarr[6][3],bookarr[6][4],bookarr[6][5],bookarr[6][6],bookarr[6][7],bookarr[6][8],bookarr[6][9]));
        books.add(new bookshelf(bookarr[7][0],bookarr[7][1],bookarr[7][2],bookarr[7][3],bookarr[7][4],bookarr[7][5],bookarr[7][6],bookarr[7][7],bookarr[7][8],bookarr[7][9]));
        books.add(new bookshelf(bookarr[8][0],bookarr[8][1],bookarr[8][2],bookarr[8][3],bookarr[8][4],bookarr[8][5],bookarr[8][6],bookarr[8][7],bookarr[8][8],bookarr[8][9]));
        books.add(new bookshelf(bookarr[9][0],bookarr[9][1],bookarr[9][2],bookarr[9][3],bookarr[9][4],bookarr[9][5],bookarr[9][6],bookarr[9][7],bookarr[9][8],bookarr[9][9]));
        books.add(new bookshelf(bookarr[10][0],bookarr[10][1],bookarr[10][2],bookarr[10][3],bookarr[10][4],bookarr[10][5],bookarr[10][6],bookarr[10][7],bookarr[10][8],bookarr[10][9]));
        books.add(new bookshelf(bookarr[11][0],bookarr[11][1],bookarr[11][2],bookarr[11][3],bookarr[11][4],bookarr[11][5],bookarr[11][6],bookarr[11][7],bookarr[11][8],bookarr[11][9]));
        books.add(new bookshelf(bookarr[12][0],bookarr[12][1],bookarr[12][2],bookarr[12][3],bookarr[12][4],bookarr[12][5],bookarr[12][6],bookarr[12][7],bookarr[12][8],bookarr[12][9]));
        books.add(new bookshelf(bookarr[13][0],bookarr[13][1],bookarr[13][2],bookarr[13][3],bookarr[13][4],bookarr[13][5],bookarr[13][6],bookarr[13][7],bookarr[13][8],bookarr[13][9]));
        books.add(new bookshelf(bookarr[14][0],bookarr[14][1],bookarr[14][2],bookarr[14][3],bookarr[14][4],bookarr[14][5],bookarr[14][6],bookarr[14][7],bookarr[14][8],bookarr[14][9]));
        books.add(new bookshelf(bookarr[15][0],bookarr[15][1],bookarr[15][2],bookarr[15][3],bookarr[15][4],bookarr[15][5],bookarr[15][6],bookarr[15][7],bookarr[15][8],bookarr[15][9]));
        books.add(new bookshelf(bookarr[16][0],bookarr[16][1],bookarr[16][2],bookarr[16][3],bookarr[16][4],bookarr[16][5],bookarr[16][6],bookarr[16][7],bookarr[16][8],bookarr[16][9]));
        books.add(new bookshelf(bookarr[17][0],bookarr[17][1],bookarr[17][2],bookarr[17][3],bookarr[17][4],bookarr[17][5],bookarr[17][6],bookarr[17][7],bookarr[17][8],bookarr[17][9]));
        books.add(new bookshelf(bookarr[18][0],bookarr[18][1],bookarr[18][2],bookarr[18][3],bookarr[18][4],bookarr[18][5],bookarr[18][6],bookarr[18][7],bookarr[18][8],bookarr[18][9]));
        books.add(new bookshelf(bookarr[19][0],bookarr[19][1],bookarr[19][2],bookarr[19][3],bookarr[19][4],bookarr[19][5],bookarr[19][6],bookarr[19][7],bookarr[19][8],bookarr[19][9]));
        
        //start LMS
        JOptionPane.showMessageDialog(null,"Welcome to Library Management System build by Group 10.\nYou can search book that you want and borrow it from this Library Management System.\nFirst, please login your account.","LMS - Welcome",JOptionPane.INFORMATION_MESSAGE);

        //determine login process
        String inputsrh="Nothing";
        int err=0;
        String val="NoName";
        String username="None";
        int amount=0;
        ArrayList<String> borrowrecord=new ArrayList();

        while(true){
            String inputacc=JOptionPane.showInputDialog(null,"Please enter your account.","LMS - Login Account",JOptionPane.QUESTION_MESSAGE);
            String inputpwd=JOptionPane.showInputDialog(null,"Please enter your password.","LMS - Login Password",JOptionPane.QUESTION_MESSAGE);
            login inputuser=new login(inputacc,inputpwd);
            for(int i=0;i<users.size();i++){
                if(inputuser.equals(users.get(i))){
                    val=users.get(i).toString();
                    String[] name=val.split(" ");
                    username=name[name.length-1];
                    break;
                }
                else{err++;}
            }
            if(err==users.size()){
                JOptionPane.showMessageDialog(null,"Your account or password isn't correct.","LMS - Incorrect",JOptionPane.ERROR_MESSAGE);
            }
            if(!(val.equals("NoName"))){
                break;
            }
        }
            
        //determine the searching result
        while(true){
            ArrayList<Object> results=new ArrayList();
            while(true){
                inputsrh=JOptionPane.showInputDialog(null,"Welcome back "+username+"! What do you want to search today?","LMS - Search",JOptionPane.QUESTION_MESSAGE);
                bookshelf srh=new bookshelf(inputsrh);
                for(int i=0;i<books.size();i++){
                    if(inputsrh.equals("All")){
                        results.add(books.get(i).toString());
                    }
                    if(srh.equals(books.get(i))){
                        results.add(books.get(i).toString());              
                    }
                }
                if(results.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Can't find "+inputsrh+" in our library.","LMS - Not found",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    break;
                }
            }
            
            //reservation
            String checkout="NotSure";
            String borrowbook="NoBook";
            String[] place={"Banqiao","Headquarters","Sanchong","Xindian","Xizhi","Xinzhuang Yumin_Children's Room","Yonghe Open Shelves"};
            String[] result=results.toArray(new String[0]);
            while(true){
                borrowbook=(String)JOptionPane.showInputDialog(null,"Which book do you want to borrow?","LMS - Choose book",JOptionPane.QUESTION_MESSAGE,null,result,result[0]);
                int preorder=JOptionPane.showConfirmDialog(null,"Are you sure you want to pre-order this book?"+borrowbook,"LMS - Reservation Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
                if(preorder==JOptionPane.YES_OPTION){
                    checkout=(String)JOptionPane.showInputDialog(null,"Which place you want to receive the book?","LMS - Choose place",JOptionPane.QUESTION_MESSAGE,null,place,place[0]);
                    break;
                }
               
            }
            
            //output
            String[] last=borrowbook.split("\\|");
            int ppl=Integer.parseInt(last[last.length-1].substring(23));
            if(last[last.length-3].substring(9).equals("Item_in_place")){
                if(checkout.equals(last[last.length-4].substring(8))){
                    JOptionPane.showMessageDialog(null,username+", your reservation is sucessful.\n"+last[0]+"\n"+last[1].substring(1)+"\nReceive place: "+checkout+"\nThe book will be hold for seven days, please come and borrow it as soon as possible.","LMS - Reservation Successful",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,username+", your reservation is sucessful.\n"+last[0]+"\n"+last[1].substring(1)+"\nReceive place: "+checkout+"\nPlease wait for delivation.","LMS - Reservation Successful",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else if(last[last.length-2].substring(14).equals("null")){
                JOptionPane.showMessageDialog(null,username+", your reservation is sucessful.\n"+last[0]+"\n"+last[1].substring(1)+"\nReceive place: "+checkout+"\nThe recent borrower's status is: "+last[last.length-2].substring(14)+"\nYou need to wait for "+ppl+" people return the book.","LMS - Reservation Successful",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(ppl==0){
                JOptionPane.showMessageDialog(null,username+", your reservation is sucessful.\n"+last[0]+"\n"+last[1].substring(1)+"\nReceive place: "+checkout+"\nThe recent borrower's limit date of returning the book is "+last[last.length-2].substring(14)+"\nYou are the next borrower.","LMS - Reservation Successful",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,username+", your reservation is sucessful.\n"+last[0]+"\n"+last[1].substring(1)+"\nReceive place: "+checkout+"\nThe recent borrower's limit date of returning the book is "+last[last.length-2].substring(14)+"\nYou need to wait for "+ppl+" people return the book.","LMS - Reservation Successful",JOptionPane.INFORMATION_MESSAGE);
            }    
            amount++;
            //limit reached
            if(amount>3){
                amount--;
                int limit=JOptionPane.showConfirmDialog(null,"You have reached the borrowing limit.","LMS - Reach Borrowing Limit",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if(limit==JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null,"Thank you for using our Library Management System, hope to see you again. Bye~","LMS - End LMS",JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                else if(limit==JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null,"Please return at least one book and you can borrow a new one.","LMS - Notice",JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null,"Thank you for using our Library Management System, hope to see you again. Bye~","LMS - End LMS",JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
            borrowrecord.add(last[0]+last[1]+last[5]+" Receive place: "+checkout+"\n");
            
            //end
            int endlms=JOptionPane.showConfirmDialog(null,"Are you sure you want to end the Library Management System?","LMS - End LMS Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if(endlms==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null,"Thank you for using our Library Management System, hope to see you again. Bye~","LMS - End LMS",JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
        
        //record
        File file3=new File("LMS_record.txt");
        file3.createNewFile();
        FileWriter writer= new FileWriter(file3);
        writer.write("User: "+username+"\nTotal borrow books: "+amount+"\nDetail:\n"+borrowrecord);
        writer.flush();
        writer.close();
        FileReader fr = new FileReader(file3); 
        char [] a = new char[200];
        fr.read(a); 
        for(char c : a)
            System.out.print(c); 
        fr.close();
        System.exit(0);
    }
}