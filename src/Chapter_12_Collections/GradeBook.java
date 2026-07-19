package Chapter_12_Collections;
/* Exercise 10 - Grade Book:
• Students were given a pop quiz, and collectively, they didn't do so great.
As a result, the instructor decided to give them a make-up exam to allow them to improve their scores.
• Given two maps of test scores, update the students' grades only if they did better on the make-up exam.
• Print the final grades.
*/

import java.util.Map;

public class GradeBook {

    public static void main(String[] args){

        Map<String, Integer> test1 = TestResults.getOriginalGrades();
        Map<String, Integer> test2 = TestResults.getMakeUpGrades();

        for (var student : test2.entrySet()){
           Integer firstGrade = test1.get(student.getKey());
           Integer secondGrade = test2.get(student.getKey());

           if (secondGrade > firstGrade){
               test1.put(student.getKey(), secondGrade);
           }
        }

         /*
            The forEach is used here to demonstrate another approach to looping.
            However, in reality, I would have added a print statement inside of
            the loop above so that the program does not have to loop over this map
            for a second time. This would be a more efficient approach.
           */
        System.out.println("Final Grades");
        test1.forEach(
                (key, value) -> System.out.println("Student: " + key + ", Grade: " + value));
    }
}
