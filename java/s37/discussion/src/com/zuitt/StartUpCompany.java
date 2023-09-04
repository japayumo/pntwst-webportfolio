package com.zuitt;

public class StartUpCompany {

    /*private StartUpEmployee startUpEmployee;
    public StartUpCompany(StartUpEmployee startupEmployee){
        this.startupEmployee = startupEmployee;
    }*/

    private AdminStaff adminStaff;
    public StartUpCompany(AdminStaff adminStaff){
        this.adminStaff = adminStaff;
    }

    public void getSortPaperTask(AdminStaff adminStaff){
        adminStaff.sortPapers();
    }
}
