package scenes;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class loginScene extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage myStage) throws Exception {
		//scene1 login
		RadioButton Student = new RadioButton("Student");
		RadioButton Teacher = new RadioButton("Teacher");
		ToggleGroup loginGroup = new ToggleGroup();
		Student.setToggleGroup(loginGroup);
		Teacher.setToggleGroup(loginGroup);
		
		Label loginType = new Label("Select Login Type        ");
		Label userText = new Label("     Username");
		Label password = new Label("     Password");
				
		TextField userInput = new TextField();
		TextField passwordInput = new TextField();
				
		Image logo = new Image("img\\logo.jpg");
		BackgroundImage logoview = new BackgroundImage(logo,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
				Background bGround = new Background(logoview);
		
		Button submit = new Button("Submit");
		
		myStage.setTitle("VegaBunk");
		GridPane node1 = new GridPane();
		
		node1.setPadding(new Insets(10, 10, 10, 10)); 
	    node1.setVgap(10); 
	    node1.setHgap(10);       
	    node1.setAlignment(Pos.CENTER);
	    node1.setBackground(bGround); 
	   
	    
	    node1.add(loginType, 0, 0);
		node1.add(Student, 1, 0);
		node1.add(Teacher, 2, 0);
		node1.add(userText,0,2); 
		node1.add(userInput,1,2);
		node1.add(password,0,3);
		node1.add(passwordInput, 1,3);
		node1.add(submit,1,4);
		Scene login = new Scene(node1, 1200, 700);
		//myStage.setScene(login);
		
		//scene2 student
		Image sphoto = new Image("img\\cs013.jpg");
		ImageView sView = new ImageView(sphoto);
		Label name = new Label("NAME");
		Label sem = new Label("SEM-DEPT");
		Label subjectName;
		
		String subjects[] = {"MATHS", "OS", "DBMS", "DAA", "JAVA","WEB"};
		sView.setFitHeight(100);
		sView.setFitWidth(100);
		GridPane node2 = new GridPane();
		node2.setGridLinesVisible(true);
	
		node2.setPadding(new Insets(10, 10, 10, 10)); 
		//node2.setVgap(10); 
//		node2.setHgap(10);       
		
		node2.add(sView,0,0,3,4);
		node2.add(name,4,2);
		node2.add(sem,4,3);
		
		node2.add(new Label("Subjects"), 0, 5,3,3);
		node2.add(new Label("Attendance"), 2, 5,3,3);
		node2.add(new Label("CIE"), 3, 5,3,3);
		for(int i=0; i<6;i++) {
			subjectName = new Label(subjects[i]);
			
			node2.add(subjectName, 0, 3 + 3*i);
			
		}
		
		Scene loginNext = new Scene(node2,1200,700);
		
		myStage.setScene(loginNext);
		submit.setOnAction(e -> myStage.setScene(loginNext));	

		
		myStage.show();
	}
}