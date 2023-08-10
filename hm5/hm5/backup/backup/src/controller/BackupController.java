package controller;

import module.Backup;

public class BackupController {
    public BackupController(){
        new Backup().backup(".","./backup");
    }
}
