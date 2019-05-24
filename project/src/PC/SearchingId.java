package PC;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.w3c.dom.UserDataHandler;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTable;

public class SearchingId extends JFrame{
   static PcDAO dao = new PcDAO();
   static PcDTO dto = new PcDTO();
   
   static PcMain pc;
   int price = pc.price;
   static String id;
   
   static JTable table;
   static DefaultTableModel model;
   
   public void aaaa() {
	   dispose();
   }
   
   public void SearchingIdCon() {
      // 회원 정보 패널
      JPanel memberInfoPanel = new JPanel();
      getContentPane().add(memberInfoPanel);
      
      // 검색 테이블
      String[] sub = {""};
      String[][] sub2 = {{"ID"}};
      model = new DefaultTableModel(sub2,sub) {
    	  public boolean isCellEditable(int i, int c) {
    		  return false;
    	  }
      };
      table = new JTable(model);
      table.setBounds(29, 104, 585, 275);
      table.addMouseListener(new MouseAdapter() {
    	  @Override
    	public void mouseClicked(MouseEvent e) {
    		  if(e.getClickCount()==2) {
	    		  JTable t = (JTable) e.getSource();
	    		  Point pt = e.getPoint();
	    		  int i = t.rowAtPoint(pt);
	    		  
	    		  PcMain pc = new PcMain();
	    		  pc = new PcMain();
	    		  PcMain_AfterSearchingId pc2 = new PcMain_AfterSearchingId();
    			  aaaa();
    			  pc.bbbb();
    			  pc2.PcMain_AfterSearchingIdCon();
    			  dispose();
    		  }
    	}
	});
      getContentPane().add(table);
      
      
      
      // 검색창
      JTextField searchTextField = new JTextField(20);
      searchTextField.setBounds(166, 52, 403, 29);
      getContentPane().add(searchTextField);
      JButton searchBtn = new JButton("검색");
      searchBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            String inputId = searchTextField.getText(); // 검색하고 싶은 아이디값
            
            PcDTO dto = dao.selectId(inputId);
            id = dto.getId();
            
            if(inputId.equals(id)) {
               model.addRow(new Object[] {id});
            } else {
               JOptionPane.showMessageDialog(null, "검색결과가 없습니다");
            }
         }
      });
      searchBtn.setBounds(581, 55, 66, 23);
      getContentPane().add(searchBtn);
      
      JButton deleteBtn = new JButton("삭제");
      deleteBtn.setBounds(659, 55, 66, 23);
      getContentPane().add(deleteBtn);
      deleteBtn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
        	  searchTextField.setText("");
          }
  	  });
      
      
      
      // 프레임 옵션
      setSize(912, 441);
      getContentPane().setLayout(null);
      
      
      setVisible(true);
   }
   public static void main(String[] args) {
      SearchingId SearchingId = new SearchingId();
      SearchingId.SearchingIdCon();
   }
}