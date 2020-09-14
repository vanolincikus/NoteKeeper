package com.example.mynotekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }


    private fun initializeCourses() {
        var course = CourseInfo("android_intens", "Android Programing with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", title = "Android Async Programing")
        courses.set(course.courseId, course)

        course = CourseInfo(
            title = "Java Fundamentals: The Java Language",
            courseId = "java_fundamentals"
        )
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)

    }

    private fun initializeNotes() {
        var note = NoteInfo(
            CourseInfo("java_core", "Java Fundamentals: The Core Platform"),
            "Threads",
            "very interestind"
        )
        notes.add(note)
        note = NoteInfo(
            CourseInfo("java_core", "Java Fundamentals: The Core Platform"),
            "Threads1",
            "very interestind1"
        )
        notes.add(note)
        note = NoteInfo(
            CourseInfo("java_core", "Java Fundamentals: The Core Platform"),
            "Threads2",
            "very interestind2"
        )
        notes.add(note)
        notes.add(note)
        note = NoteInfo(
            CourseInfo("java_core", "Java Fundamentals: The Core Platform"),
            "Threads1",
            "very interestind1"
        )
        notes.add(note)
        note = NoteInfo(
            CourseInfo("java_core", "Java Fundamentals: The Core Platform"),
            "Threads2",
            "very interestind2"
        )
        notes.add(note)
        notes.add(note)
        note = NoteInfo(
            CourseInfo("java_core", "Java Fundamentals: The Core Platform"),
            "Threads1",
            "very interestind1"
        )
        notes.add(note)
        note = NoteInfo(
            CourseInfo("java_core", "Java Fundamentals: The Core Platform"),
            "Threads2",
            "very interestind2"
        )
        notes.add(note)
        notes.add(note)
        note = NoteInfo(
            CourseInfo("java_core", "Java Fundamentals: The Core Platform"),
            "Threads1",
            "very interestind1"
        )
        notes.add(note)
        note = NoteInfo(
            CourseInfo("java_core", "Java Fundamentals: The Core Platform"),
            "Threads2",
            "very interestind2"
        )
        notes.add(note)
    }

}