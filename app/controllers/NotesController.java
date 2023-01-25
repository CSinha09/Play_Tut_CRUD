package controllers;

import models.Note;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.index;
import views.html.notes.*;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Set;

public class NotesController extends Controller {

    @Inject
    FormFactory formFactory;

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
        Form<Note> noteForm = formFactory.form(Note.class);
        return ok(views.html.notes.create.render(noteForm));
    }

    public Result save(){
        Form<Note> noteForm = formFactory.form(Note.class).withDirectFieldAccess(true).bindFromRequest();
        Note note = noteForm.get();
        Note.addNewNote(note);
        return redirect(routes.NotesController.home());
    }

    // To delete a specific note
    public Result remove(String id){
        return TODO();
    }

    // To update a specific note
    public Result update(String id){
        return TODO();
    }

}
