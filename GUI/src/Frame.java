import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Frame extends JFrame
{
   private JLabel labelDay;
   private JLabel labelMonth;
   private JLabel labelYear;
   private JTextField textFieldDay;
   private JTextField textFieldMonth;
   private JTextField textFieldYear;
   private JButton buttonShow;
   
   public Frame()
   {
      super("Date");
      createComponents();
      initializeComponents();
      registerEventHandlers();
      addComponentsToFrame();
   }
   private void createComponents()
   {
      textFieldDay=new JTextField(6);
      textFieldMonth=new JTextField(6);
      textFieldYear=new JTextField(6);
      labelDay=new JLabel("Day: ");
      labelMonth=new JLabel("Month: ");
      labelYear=new JLabel("Year: ");
      buttonShow=new JButton("Show");
   }
   private void initializeComponents()
   {
      setSize(300, 120);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      textFieldDay.setText("");
      textFieldMonth.setText("");
      textFieldYear.setText("");
      buttonShow.requestFocus();
   }
   private void registerEventHandlers()
   {
      ButtonHandler handler = new ButtonHandler();
      buttonShow.addActionListener(handler);
   }
   private void addComponentsToFrame()
   {
      JPanel panelDate=new JPanel(new BorderLayout());
      panelDate.add(labelDay, BorderLayout.NORTH);
      panelDate.add(labelMonth, BorderLayout.WEST);
      panelDate.add(labelYear, BorderLayout.SOUTH);
      JPanel panelText=new JPanel(new BorderLayout());
      panelText.add(textFieldDay.NORTH);
      panelText.add(textFieldMonth.WEST);
      panelText.add(textFieldYear, BorderLayout.SOUTH);
      
      JPanel panelButtons=new JPanel(new BorderLayout(0,5));
      panelButtons.add(buttonShow);
      
      JPanel contentPane=new JPanel(new FlowLayout());
      contentPane.add(panelDate);
      contentPane.add(panelButtons);
      
      setContentPane(contentPane);
   }
   
   private class ButtonHandler implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         String msgday=textFieldDay.getText();
         String msgmonth=textFieldMonth.getText();
         String msgyear=textFieldYear.getText();
         JOptionPane.showMessageDialog(null, msgday+"/"+msgmonth+"/"+msgyear);
      }
   }
   
   public static void main(String[] args)
   {
      Frame frame=new Frame();
   }
}
