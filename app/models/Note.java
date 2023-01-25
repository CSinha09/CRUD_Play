package models;

import scala.Int;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Note {

    public String id;
    public String title;
    public String content;

    public Note(){}
    public Note(String id, String title, String content){
        this.id=id;
        this.title=title;
        this.content=content;
    }

    private static Set<Note> notes;

    static {
        notes=new HashSet<>();
        notes.add(new Note("1", "Java", "OOP"));
        notes.add(new Note("2", "C++", "Pointers"));
        notes.add(new Note("3", "Python", "NumPy"));
        notes.add(new Note("4", "Scala", "Apache"));
        notes.add(new Note("12", "Abcd", "Not Enough"));
        notes.add(new Note("5", "NOTA", "Suggestion is required"));
    }

    public static Set<Note> allNotes(){
        return notes;
    }

    public static Note findById(String id){
        for(Note note: notes){
            if(note.id == id) return note;
        }
        return new Note("10", "Test", "Test done");
    }

    public static void addNewNote(Note note){
        notes.add(note);
    }

    public static boolean removeNote(Note note){
        return notes.remove(note);
    }

    public static void main(String[] args){
        for(Note x: notes){
            System.out.println(x.id);
        }
    }

}

