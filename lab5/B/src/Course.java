public class Course {
    String courseTitle, description;
    TextBook tb;
    Instructor instr;

    public Course() {}

    public Course(String courseTitle, TextBook tb, Instructor instr, String description){
        this.courseTitle = courseTitle;
        this.tb = tb;
        this.instr = instr;
        this.description = description;
    }
    public Course(String courseTitle, String description){
        this.courseTitle = courseTitle;
        this.description = description;
    }

    @Override
    public boolean equals(Object o ){
        Course c = (Course)o;
        if(c.courseTitle == this.courseTitle && c.tb.equals(this.tb) && c.instr.equals(this.instr)) return true;
        return false;
    }

    @Override
    public String toString(){
        return "Course title is " + this.courseTitle + ". " + "Instructor: " + this.instr.toString() + " Text book: " + this.tb.toString();
    }
}
