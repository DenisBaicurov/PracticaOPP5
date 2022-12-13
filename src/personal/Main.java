package personal;

import personal.controllers.UserController;
import personal.model.*;
import personal.views.ViewUser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
boolean b=false;


        System.out.println("Нажмите от 0 до 9 для работы в user.txt");
        System.out.println("Нажмите любую другую для работы в semminar5.txt");
        Scanner scanner =new Scanner(System.in);
        String s=scanner.nextLine();
        String []arr=new String[]{"0","1","2","3","4","5","6","7","8","9"};
        for (int i=0; i<arr.length;i++){
            if (s.equals(arr[i])){
               b=true;
            }
  }
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        FileOperation fileOperation1 =new FileOperationImpl("semminar5.txt");

        Repository repository1 =new AnotherRepozitoryFile(fileOperation1);

        UserController controller1 =new UserController(repository1);

        if (b==true){
            ViewUser view = new ViewUser(controller);
            view.run();
        }
        if (b==false){
            ViewUser view = new ViewUser(controller1);
            view.run();
        }

    }
}
