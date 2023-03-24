/*In a class of 57 students the teacher was collecting data of her students, 
 * The data she required was:
 * The gender of the students
 * The course they are doing
 * the feedback on boys playing football
 * the feedback on the ladies playing hockey
 * the feedback on the curriculum
 * Using inheritance, represent the gender and the course as
 * properties and the feedback as methods*/

// Base class for student
open class Student(val gender: String, val course: String) {
    // Abstract method for feedback
    open fun feedback(): String {
        return "No feedback provided."
    }
}

// Subclass for male student
class MaleStudent(course: String, val footballFeedback: String, val curriculum: String) : Student("Male", course) {
    override fun feedback(): String {
        return "Football feedback: $footballFeedback" + "Curriculum feedback: $curriculum"
    }
}

// Subclass for female student
class FemaleStudent(course: String, val hockeyFeedback: String,val curriculum: String) : Student("Female", course) {
    override fun feedback(): String {
        return "Hockey feedback: $hockeyFeedback" + "Curriculum feedback: $curriculum"
    }
}

// Sample usage
fun main() {
    val students = arrayOf(
        MaleStudent("ICT", "The game is Intresting", "This Curriculum is great "),
        FemaleStudent("Education", "The rules are quite same as football","Need to be Changed"),
        MaleStudent("Medicine", "I hate this game", "An Overhaul is Needed"),
        FemaleStudent("Business", "Excellent", "Its just perfect"),

    )

    // Print feedback for each student
    for (student in students) {
        println("Gender: ${student.gender}, Course: ${student.course}, Feedback: ${student.feedback()}")
    }
}
