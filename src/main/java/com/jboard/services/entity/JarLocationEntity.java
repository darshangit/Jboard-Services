package com.jboard.services.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Dash on 11/15/2017.
 */
@Entity
@Table(name="JARLOCATION")
public class JarLocationEntity {

    private String projectName;
    private String projectPath;

    @Id
    @Column(name="PROJECT_NAME")
    public String getProjectName() {
        return projectName;
    }

    @Column(name="PROJECT_PATH")
    public String getProjectPath() {
        return projectPath;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }
}
