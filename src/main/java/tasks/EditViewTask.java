package tasks;

import components.ViewControl;
import components.ViewSetting;
import pages.EditViewPage;

public class EditViewTask {

    public void editView(){
        ViewControl viewControl = new ViewControl();
        viewControl.selectView("testView");
        ViewSetting viewSetting = new ViewSetting();
        viewSetting.clickEdit();
        EditViewPage editViewPage = new EditViewPage();
        editViewPage.editView();
        editViewPage.saveView();
    }
}
