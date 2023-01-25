package controllers;

import models.Note;
import play.mvc.*;
import views.html.index;
import views.html.notes.*;

import java.util.HashMap;
import java.util.Set;

public class NotesController extends Controller {

    // To GET all the available notes
    public Result home() {
        Set<Note> allNotes = Note.allNotes();
        return ok(views.html.notes.index.render(allNotes));
    }

    // To GET a specific note
    public Result view(Integer id){
        return TODO();
    }

    // To create a note
    public Result create(){
        return TODO();
    }

    // To delete a specific note
    public Result remove(Integer id){
        return TODO();
    }

    // To update a specific note
    public Result update(Integer id){
        return TODO();
    }

}
