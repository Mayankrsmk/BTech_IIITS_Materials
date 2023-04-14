#include<stdio.h>
#include<stdlib.h>


typedef struct student {
    int rollNum;
    double CGPA;
} Student;

Student* addStudent(){
    Student *s = (Student*) malloc (sizeof(Student));
    return s;
}
void setDetails(Student* s, int rollNum, double CGPA){
    s->rollNum = rollNum;
    s->CGPA = CGPA;
}

void getDetails(Student *s){
    printf("%d\n%g\n",s->rollNum, s->CGPA);
}
void main()
{
	Student *s1, *s2;
	s1 = addStudent();
	setDetails(s1, 101, 9.2);
	getDetails(s1);

	s2 = addStudent();
	setDetails(s2, 102, 8.7);
	getDetails(s2);

}