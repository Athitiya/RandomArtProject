class Frame extends JFrame{
    private ArtPanel Panel;
    private JLabel CurrentExpression;
    
    private static final int fontSize = 16;
    private static final int corner = 100;
    
    public Frame(){
        setTittle("OOP Project : RandomArt");
        setLocation(corner);
        setDafaultCloseOperation(JFrame.ExitOnClose);
        
        setMenuBar(creatMenu());
        
        panel = new ArtPanel();
        JPanel button1 = new JPanel();
        button1.add(getButton("New Gray"),false));
        button1.add(getButton("New color"),false));
        
        CurruntExpression = new JLabel(Panel.getExpressionInString());
        CurrentExpression.setFont(new Font("Angsana",font.plain,fontSize));
        
        add(Panel,BorderLayout.CENTER);
        add(button1,BorderLayout.SOUTH);
        add(CurrentExpression,BorderLayout.North);
        pack();
    }
    private JMenuBar createMenu(){
        final int Num =  ArtPanel.NumCol;
        JMenuBar = new JMenuBar();
        final String label = "Color Option";
        JMenu colorOption = new JMenu(label);
        menu.add(colorOption);
        for(int i = 0; i < Num; i++){
            JMenuItem temp = colorOption.add(label+" "+(i+1));
        }
        return  menu;
    }
    public JButton getButton(String label, final boolean mekeColor){
        JButton result = new JButton(label);
        return result;
    }
    public void start(){
        setVisible(true);
    }
}