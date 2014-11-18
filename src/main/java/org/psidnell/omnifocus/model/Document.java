/*
Copyright 2014 Paul Sidnell

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package org.psidnell.omnifocus.model;

import java.util.List;

import org.psidnell.omnifocus.osa.OSACollection;
import org.psidnell.omnifocus.osa.OSADefaultValue;
import org.psidnell.omnifocus.osa.OSAIgnore;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Document extends Node {

    public static final String TYPE = "Document";
    private List<Project> projects;
    private List<Folder> folders;
    private List<Context> contexts;
    private List<Task> tasks;
    
    public Document () {
        name = "Document";
    }
    
    @OSACollection(type=Project.class)
    @OSADefaultValue(value="[]")
    public List<Project> getProjects () {
        return projects;
    }
    
    public void setProjects (List<Project> projects) {
        this.projects = projects;
    }
    
    @OSACollection(type=Folder.class)
    @OSADefaultValue(value="[]")
    public List<Folder> getFolders () {
        return folders;
    }
    
    public void setFolders (List<Folder> folders) {
        this.folders = folders;
    }
    
    @OSACollection(type=Context.class)
    @OSADefaultValue(value="[]")
    public List<Context> getContexts () {
        return contexts;
    }
    
    public void setContexts (List<Context> contexts) {
        this.contexts = contexts;
    }
    
    @OSACollection(type=Task.class)
    @OSADefaultValue(value="[]")
    public List<Task> getTasks () {
        return tasks;
    }
    
    public void setTasks (List<Task> tasks) {
        this.tasks = tasks;
    }
    
    @Override
    @JsonIgnore
    @OSAIgnore
    public String getType() {
        return TYPE;
    }

}