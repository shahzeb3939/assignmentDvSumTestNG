package tests;

import org.testng.annotations.Test;
import tasks.EditViewTask;

public class EditViewTest {

    @Test
    public void editViewTest(){
        EditViewTask editViewTask = new EditViewTask();
        editViewTask.editView();

    }
}
