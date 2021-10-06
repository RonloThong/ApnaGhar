package com.apna.team.demo;


import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.VaadinRequest;
import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;


@UIScope
public class ApnaGharUI<ApnaGharLayout> extends UI{

    private VerticalLayout root;

    @Autowired
    ApnaLayout apnalayout;
    private Object ApnaLayout;

    @Override
    protected void init(VaadinRequest request) {
        super.init(request);
        setupLayout();
        addHeader();
        addForm();
        addApnaList();
    }

    private void setupLayout() {
        root = new VerticalLayout();
        setCurrent(root);

        
    }
    

    private void addHeader(){

        root.addComponentAsFirst(new Label("Aona Ghar"));
        
    }
    private void addForm(){
        HorizontalLayout formLayout = new HorizontalLayout();
        TextField task = new TextField();
        Button donate = new Button("Donate");
        Button SoS = new Button("S.O.S");
        Button contact = new Button("contact");
        Button sign = new Button("Sign");

        formLayout.addComponentAsFirst(task,donate,SoS,contact,sign);
        root.addComponentAsFirst(formLayout);



    }
    private void addApnaList(){
        root.addComponentAsFirst(ApnaLayout);
        
    }
    public void setCurrent(VerticalLayout current) {
        this.current = current;
    }
}
