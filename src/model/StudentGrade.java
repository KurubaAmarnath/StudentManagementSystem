package model;
public enum StudentGrade{
    A, B, C, D, F;
    public static StudentGrade calculate( double marks){
        if(marks>=90){
            return A;
        } else if ( marks>=80){
            return B;
        } else if (marks>=70){
            return C;
        } else if ( marks>=60){
            return D;
        } else {
            return F;
        }
    }
}
