package main.java;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import main.java.animals.*;


public class ZooGUI extends JFrame{

    //HashMap to hold animal AND subspecies names
    private final Map<String, String[]> animals = new HashMap<>();
    {
        animals.put("lions", new String[]{"African Lion", "Congo Lion"});
        animals.put("birds", new String[]{"Chicken", "Swallow"});
    }

    


    
    private CardLayout cL = new CardLayout();
    private JPanel mainPanel = new JPanel(cL);

    private JPanel subButtons;
    private JLabel subTitle;
    private JTextArea display;


    private Animal currAnimal;

    



    public ZooGUI() {

        setTitle("Zoo");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JTextArea(4, 30);
        display.setEditable(false);
        display.setLineWrap(true);
        
        
        
        mainPanel.add(createAnimalPanel(), "ANIMALS");
        mainPanel.add(createSubspeciesPanel(), "SUBSPECIES");
        mainPanel.add(createActionPanel(), "ACTIONS");

        add(mainPanel, BorderLayout.CENTER);

        add(display, BorderLayout.SOUTH);

    }
//---------ANIMAL STUFF------------\\
    /** createAnimalPanel
     *  Creates the panel that shows the different types of animals to choose
     * 
     * @return - The created animal Panel
     */
    private JPanel createAnimalPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        for (String animal : animals.keySet()) {
            JButton button = new JButton(makeName(animal));
            button.addActionListener(e -> showSubspecies(animal));
            panel.add(button);
        }

        return panel;
    }

//--------Subspecies Stuff-----------\\
    /** createSubspeciesPanel
     *  Creates the barebones outline of the subspecies panel
     *      The framework is used in showSubspecies to setup the panel
     * 
     * @return - The created Subspecies panel
     */
    private JPanel createSubspeciesPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        subTitle = new JLabel("", SwingConstants.CENTER);
        //subTitle.setFont
        panel.add(subTitle, BorderLayout.NORTH);

        subButtons = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.add(subButtons, BorderLayout.CENTER);

        JButton returnBtn = new JButton("Back to Animals");
        returnBtn.addActionListener(e -> cL.show(mainPanel, "ANIMALS"));
        panel.add(returnBtn, BorderLayout.SOUTH);

        return panel;
    }

    /** showSubSpecies
     *  Sets up and presents the panel for the chosen animals subspecies
     * 
     * @param animal - The animal whose subspecies will be shown
     */
    private void showSubspecies(String animal) {
        subTitle.setText("Choose " + makeName(animal) + " Type");
        subButtons.removeAll();

        //Load list of animals subspecies from hashmap
        String[] subList = animals.getOrDefault(animal, new String[]{});

        for (String name : subList) {
            JButton subButton = new JButton(name);
            subButton.addActionListener(e -> loadSubSpecies(animal, name));
            subButtons.add(subButton);
        }

        subButtons.revalidate();
        subButtons.repaint();
        
        cL.show(mainPanel, "SUBSPECIES");
    }

    /** loadSubSpecies
     *  Loads the class for the chosen subspecies
     * 
     * @param category - The animal name, HAS to be in the format of the folder
     *                  EX: lions not Lion
     * @param subspeciesName - The name of the specific subspecies being used
     *                  This can just be the same as the text used for buttons
     */
    private void loadSubSpecies(String category, String subspeciesName) {
        try {
            String subName = subspeciesName.replace(" ", "");
            //String cat = category.toLowerCase() + "s";
            String path = "main.java.animals." + category + "." + subName;

            Class<?> currClass = Class.forName(path);

            //Do not remove (Animal) it needs to brute force the type
            this.currAnimal = (Animal) currClass.getDeclaredConstructor().newInstance();

            display.setText("Loaded " + subspeciesName + " into area.");

            cL.show(mainPanel, "ACTIONS");

        } catch (Exception e) {
            System.out.println("Could not load class: " + subspeciesName);
        }
    }

//--------ACTION STUFF------------\\
    /** createActionPanel
     *  Creates the panel where each subspecies actions can be shown
     * 
     * @return - The created Action Panel
     */
    private JPanel createActionPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        JPanel buttons = new JPanel();

        JButton move = new JButton("Perform Move");
        JButton sound = new JButton("Perform Sound");
        JButton diet = new JButton("Show Diet");

        buttons.add(move);
        buttons.add(sound);
        buttons.add(diet);

        panel.add(buttons, BorderLayout.CENTER);

        

        JButton returnBtn = new JButton("Back to Subspecies");
        returnBtn.addActionListener(e -> cL.show(mainPanel, "SUBSPECIES"));
        panel.add(returnBtn, BorderLayout.SOUTH);
        
        move.addActionListener(e -> {
            display.setText(currAnimal.performMove());

        });
        sound.addActionListener(e -> {
            display.setText(currAnimal.performSound());
        });
        diet.addActionListener(e -> {
            display.setText(currAnimal.performDiet());
        });

        return panel;
    }




    /** makeName
     *  Capitalizes given string and removes s
     *      For use so the animal names by default can follow folder names
     * 
     * @param lowercase - The String to capitalize
     * @return - The capitalized String
     */
    private String makeName(String lowercase) {
        return lowercase.substring(0, 1).toUpperCase() + lowercase.substring(1, lowercase.length()-1);
    }
    
}
