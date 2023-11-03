// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        int counter1= 0;
        int counter2 =0;
        int summ = 0;
        Students student1 = new Students("Nurlan",18,"Java");
        Students student2 = new Students("NuR",14,"JS");
        Students student3 = new Students("NuraI",17,"Java");
        Students student4 = new Students("NurS",19,"JS");
        Students student5 = new Students("Nurlis",15,"Java");

        Students[] students = {student1,student2,student3,student4,student5};

        for (Students student : students ){
            if(student.group.equals("Java")){
                counter1++;
            }else {
                counter2++;
            }
        }
        for (Students student : students){
            summ += student.age;
        }
        int result = summ / students.length;


        System.out.println(counter1);
        System.out.println(counter2);
        System.out.println(summ);

    }

    }

//        Passport passport = new Passport(233445565, "Raim", "Ysmaylov", 1971, "", "KR");
//
//     System.out.println(passport.id +"\n"+ passport.LastName + passport.birth + passport.country + passport.
//                gender + passport.name + passport.name);
