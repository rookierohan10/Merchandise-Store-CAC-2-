/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package merchandise.store;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    boolean menuFlag;
    ImageIcon[] icon;
    JButton[] buttons;
    JButton[] addToCart;
    boolean[] itemTracker;
    String username;
    public dashboard(String name) {
        initComponents();
        welcomeText.setText("Hello "+name);
        jPanel1.setVisible(false);
        menuFlag = true;
        username=name;
        
        icon = new ImageIcon[12];
        buttons = new JButton[12];
        itemTracker = new boolean[12];
        addToCart = new JButton[12];
        
        icon[0]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\naruto20thanniversary.png");
        icon[1]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\kakashiactionfgiure.png");
        icon[2]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\narutoallgenerationsposter.jpg");
        icon[3]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\narutokeyring2.png");
        icon[4]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\narutotshirt1.png");
        icon[5]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\narutotshirt2.png");
        icon[6]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\sasukeuchiha17cm.jpg");
        icon[7]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\spidermanbobblehead.jpg");
        icon[8]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\narutokeyring1.jpg");
        icon[9]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\narutorasenganactionfigure.jpg");
        icon[10]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\captshirt.png");
        icon[11]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\kangtshirt.png");
        
        for( int i=0;i<12;i++ ){
            Image image = icon[i].getImage();
            image = image.getScaledInstance(item1Image.getWidth(), item1Image.getHeight(), Image.SCALE_SMOOTH);
            icon[i] = new ImageIcon(image);
            itemTracker[i] = false;
        }
        
        buttons[0] = item1Image;
        buttons[1] = item2Image;
        buttons[2] = item3Image;
        buttons[3] = item4Image;
        buttons[4] = item5Image;
        buttons[5] = item6Image;
        buttons[6] = item7Image;
        buttons[7] = item8Image;
        buttons[8] = item9Image;
        buttons[9] = item10Image;
        buttons[10] = item11Image;
        buttons[11] = item12Image;
        
        addToCart[0] = addToCartItem1;
        addToCart[1] = addToCartItem2;
        addToCart[2] = addToCartItem3;
        addToCart[3] = addToCartItem4;
        addToCart[4] = addToCartItem5;
        addToCart[5] = addToCartItem6;
        addToCart[6] = addToCartItem7;
        addToCart[7] = addToCartItem8;
        addToCart[8] = addToCartItem9;
        addToCart[9] = addToCartItem10;
        addToCart[10] = addToCartItem11;
        addToCart[11] = addToCartItem12;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/javacac","root", "rookierohan");
            
            String tableName = username+"Cart";
            String q = "select * from "+tableName;
            Statement stmt=con.createStatement();
            ResultSet set = stmt.executeQuery(q);
            
            while(set.next()){
                itemTracker[set.getInt("id")] = true;
            }
            con.close();
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Error caught");
        }
        
        for( int i=0;i<12;i++ ){
            buttons[i].setIcon(icon[i]);
            buttons[i].setBorderPainted(false);
            buttons[i].setContentAreaFilled(false);
            buttons[i].setFocusPainted(false);
            if( itemTracker[i] == true) addToCart[i].setText("Remove item");
            else addToCart[i].setText("Add to Cart");
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        figuresOnly = new javax.swing.JButton();
        keychainsOnly = new javax.swing.JButton();
        clothesOnly = new javax.swing.JButton();
        allProducts = new javax.swing.JButton();
        productDisplayPanel = new javax.swing.JPanel();
        item2 = new javax.swing.JPanel();
        item2Image = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        addToCartItem2 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        item4 = new javax.swing.JPanel();
        addToCartItem4 = new javax.swing.JButton();
        item4Image = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        item3 = new javax.swing.JPanel();
        addToCartItem3 = new javax.swing.JButton();
        item3Image = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        item1 = new javax.swing.JPanel();
        item1Image = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addToCartItem1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        item8 = new javax.swing.JPanel();
        item8Image = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        addToCartItem8 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        item7 = new javax.swing.JPanel();
        item7Image = new javax.swing.JButton();
        addToCartItem7 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        item9 = new javax.swing.JPanel();
        item9Image = new javax.swing.JButton();
        addToCartItem9 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        item10 = new javax.swing.JPanel();
        item10Image = new javax.swing.JButton();
        addToCartItem10 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        item5 = new javax.swing.JPanel();
        item5Image = new javax.swing.JButton();
        addToCartItem5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        item11 = new javax.swing.JPanel();
        item11Image = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        addToCartItem11 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        item12 = new javax.swing.JPanel();
        item12Image = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        addToCartItem12 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        item6 = new javax.swing.JPanel();
        item6Image = new javax.swing.JButton();
        addToCartItem6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        welcomeText = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        moveToCart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(1051, 493));

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setPreferredSize(new java.awt.Dimension(644, 356));

        jPanel1.setBackground(new java.awt.Color(244, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(114, 330));

        figuresOnly.setBackground(new java.awt.Color(244, 0, 51));
        figuresOnly.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        figuresOnly.setForeground(new java.awt.Color(255, 255, 255));
        figuresOnly.setText("Figures");
        figuresOnly.setBorder(null);
        figuresOnly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                figuresOnlyActionPerformed(evt);
            }
        });

        keychainsOnly.setBackground(new java.awt.Color(244, 0, 51));
        keychainsOnly.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        keychainsOnly.setForeground(new java.awt.Color(255, 255, 255));
        keychainsOnly.setText("Keychains");
        keychainsOnly.setBorder(null);
        keychainsOnly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keychainsOnlyActionPerformed(evt);
            }
        });

        clothesOnly.setBackground(new java.awt.Color(244, 0, 51));
        clothesOnly.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        clothesOnly.setForeground(new java.awt.Color(255, 255, 255));
        clothesOnly.setText("Clothes");
        clothesOnly.setBorder(null);
        clothesOnly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clothesOnlyActionPerformed(evt);
            }
        });

        allProducts.setBackground(new java.awt.Color(244, 0, 51));
        allProducts.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        allProducts.setForeground(new java.awt.Color(255, 255, 255));
        allProducts.setText("All");
        allProducts.setBorder(null);
        allProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allProductsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clothesOnly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(figuresOnly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(keychainsOnly, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(allProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(allProducts)
                .addGap(12, 12, 12)
                .addComponent(figuresOnly)
                .addGap(12, 12, 12)
                .addComponent(keychainsOnly)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clothesOnly)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        productDisplayPanel.setBackground(new java.awt.Color(255, 255, 255));

        item2.setPreferredSize(new java.awt.Dimension(130, 200));

        item2Image.setBorder(null);
        item2Image.setMargin(new java.awt.Insets(0, 0, 0, 0));
        item2Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2ImageActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html>Kakashi Hatake Chidori Figure</html>");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        addToCartItem2.setBackground(new java.awt.Color(244, 0, 51));
        addToCartItem2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        addToCartItem2.setForeground(new java.awt.Color(255, 255, 255));
        addToCartItem2.setText("Add to Cart");
        addToCartItem2.setBorder(null);
        addToCartItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartItem2ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 0, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("999");

        javax.swing.GroupLayout item2Layout = new javax.swing.GroupLayout(item2);
        item2.setLayout(item2Layout);
        item2Layout.setHorizontalGroup(
            item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item2Image, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(addToCartItem2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        item2Layout.setVerticalGroup(
            item2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item2Image, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addToCartItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        item4.setPreferredSize(new java.awt.Dimension(130, 200));

        addToCartItem4.setBackground(new java.awt.Color(244, 0, 51));
        addToCartItem4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        addToCartItem4.setForeground(new java.awt.Color(255, 255, 255));
        addToCartItem4.setText("Add to Cart");
        addToCartItem4.setBorder(null);
        addToCartItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartItem4ActionPerformed(evt);
            }
        });

        item4Image.setBorder(null);
        item4Image.setMargin(new java.awt.Insets(0, 0, 0, 0));
        item4Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item4ImageActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html>Naruto Shadow Clone Keyring</html>");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("149");

        javax.swing.GroupLayout item4Layout = new javax.swing.GroupLayout(item4);
        item4.setLayout(item4Layout);
        item4Layout.setHorizontalGroup(
            item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item4Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addToCartItem4, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        item4Layout.setVerticalGroup(
            item4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, item4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item4Image, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addToCartItem4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        item3.setPreferredSize(new java.awt.Dimension(130, 200));

        addToCartItem3.setBackground(new java.awt.Color(244, 0, 51));
        addToCartItem3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        addToCartItem3.setForeground(new java.awt.Color(255, 255, 255));
        addToCartItem3.setText("Add to Cart");
        addToCartItem3.setBorder(null);
        addToCartItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartItem3ActionPerformed(evt);
            }
        });

        item3Image.setBorder(null);
        item3Image.setMargin(new java.awt.Insets(0, 0, 0, 0));
        item3Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3ImageActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html>Naruto All Gen Poster</html>");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("249");

        javax.swing.GroupLayout item3Layout = new javax.swing.GroupLayout(item3);
        item3.setLayout(item3Layout);
        item3Layout.setHorizontalGroup(
            item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addToCartItem3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(item3Image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        item3Layout.setVerticalGroup(
            item3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, item3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item3Image, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addToCartItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        item1.setPreferredSize(new java.awt.Dimension(130, 200));

        item1Image.setBorder(null);
        item1Image.setMargin(new java.awt.Insets(0, 0, 0, 0));
        item1Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1ImageActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>Naruto 20th Century Figure</html>");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        addToCartItem1.setBackground(new java.awt.Color(244, 0, 51));
        addToCartItem1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        addToCartItem1.setForeground(new java.awt.Color(255, 255, 255));
        addToCartItem1.setText("Add to Cart");
        addToCartItem1.setBorder(null);
        addToCartItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartItem1ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 0, 51));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("2499");

        javax.swing.GroupLayout item1Layout = new javax.swing.GroupLayout(item1);
        item1.setLayout(item1Layout);
        item1Layout.setHorizontalGroup(
            item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(item1Image, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(addToCartItem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        item1Layout.setVerticalGroup(
            item1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item1Image, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addToCartItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        item8.setPreferredSize(new java.awt.Dimension(130, 200));

        item8Image.setBorder(null);
        item8Image.setMargin(new java.awt.Insets(0, 0, 0, 0));
        item8Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item8ImageActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("<html>Little Spiderman Bobblehead</html>");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        addToCartItem8.setBackground(new java.awt.Color(244, 0, 51));
        addToCartItem8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        addToCartItem8.setForeground(new java.awt.Color(255, 255, 255));
        addToCartItem8.setText("Add to Cart");
        addToCartItem8.setBorder(null);
        addToCartItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartItem8ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 0, 51));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("399");

        javax.swing.GroupLayout item8Layout = new javax.swing.GroupLayout(item8);
        item8.setLayout(item8Layout);
        item8Layout.setHorizontalGroup(
            item8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(item8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item8Image, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(addToCartItem8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        item8Layout.setVerticalGroup(
            item8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item8Image, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addToCartItem8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        item7.setPreferredSize(new java.awt.Dimension(130, 200));

        item7Image.setBorder(null);
        item7Image.setMargin(new java.awt.Insets(0, 0, 0, 0));
        item7Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item7ImageActionPerformed(evt);
            }
        });

        addToCartItem7.setBackground(new java.awt.Color(244, 0, 51));
        addToCartItem7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        addToCartItem7.setForeground(new java.awt.Color(255, 255, 255));
        addToCartItem7.setText("Add to Cart");
        addToCartItem7.setBorder(null);
        addToCartItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartItem7ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("<html>Teenage Sasuke Action Figure</html>");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 0, 51));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("799");

        javax.swing.GroupLayout item7Layout = new javax.swing.GroupLayout(item7);
        item7.setLayout(item7Layout);
        item7Layout.setHorizontalGroup(
            item7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(item7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item7Image, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(addToCartItem7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        item7Layout.setVerticalGroup(
            item7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item7Image, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addToCartItem7)
                .addGap(12, 12, 12))
        );

        item9.setPreferredSize(new java.awt.Dimension(130, 200));

        item9Image.setBorder(null);
        item9Image.setMargin(new java.awt.Insets(0, 0, 0, 0));
        item9Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item9ImageActionPerformed(evt);
            }
        });

        addToCartItem9.setBackground(new java.awt.Color(244, 0, 51));
        addToCartItem9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        addToCartItem9.setForeground(new java.awt.Color(255, 255, 255));
        addToCartItem9.setText("Add to Cart");
        addToCartItem9.setBorder(null);
        addToCartItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartItem9ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("<html>Naruto Sitting Keyring</html>");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 0, 51));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("99");

        javax.swing.GroupLayout item9Layout = new javax.swing.GroupLayout(item9);
        item9.setLayout(item9Layout);
        item9Layout.setHorizontalGroup(
            item9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(item9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item9Image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(addToCartItem9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        item9Layout.setVerticalGroup(
            item9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item9Image, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addToCartItem9)
                .addGap(18, 18, 18))
        );

        item10.setPreferredSize(new java.awt.Dimension(130, 200));

        item10Image.setBorder(null);
        item10Image.setMargin(new java.awt.Insets(0, 0, 0, 0));
        item10Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item10ImageActionPerformed(evt);
            }
        });

        addToCartItem10.setBackground(new java.awt.Color(244, 0, 51));
        addToCartItem10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        addToCartItem10.setForeground(new java.awt.Color(255, 255, 255));
        addToCartItem10.setText("Add to Cart");
        addToCartItem10.setBorder(null);
        addToCartItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartItem10ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("<html>Naruto Rasengan Action Figure</html>");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 0, 51));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("899");

        javax.swing.GroupLayout item10Layout = new javax.swing.GroupLayout(item10);
        item10.setLayout(item10Layout);
        item10Layout.setHorizontalGroup(
            item10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(item10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item10Image, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(addToCartItem10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        item10Layout.setVerticalGroup(
            item10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item10Image, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addToCartItem10)
                .addGap(24, 24, 24))
        );

        item5.setPreferredSize(new java.awt.Dimension(130, 200));

        item5Image.setBorder(null);
        item5Image.setMargin(new java.awt.Insets(0, 0, 0, 0));
        item5Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item5ImageActionPerformed(evt);
            }
        });

        addToCartItem5.setBackground(new java.awt.Color(244, 0, 51));
        addToCartItem5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        addToCartItem5.setForeground(new java.awt.Color(255, 255, 255));
        addToCartItem5.setText("Add to Cart");
        addToCartItem5.setBorder(null);
        addToCartItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartItem5ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html>Uchiha Brothers Green T-shirt</html>");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("599");

        javax.swing.GroupLayout item5Layout = new javax.swing.GroupLayout(item5);
        item5.setLayout(item5Layout);
        item5Layout.setHorizontalGroup(
            item5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(item5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(addToCartItem5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item5Image, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        item5Layout.setVerticalGroup(
            item5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, item5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item5Image, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addToCartItem5)
                .addContainerGap())
        );

        item11.setPreferredSize(new java.awt.Dimension(130, 200));

        item11Image.setBorder(null);
        item11Image.setMargin(new java.awt.Insets(0, 0, 0, 0));
        item11Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item11ImageActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<html>Captain America T-shirt</html>");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        addToCartItem11.setBackground(new java.awt.Color(244, 0, 51));
        addToCartItem11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        addToCartItem11.setForeground(new java.awt.Color(255, 255, 255));
        addToCartItem11.setText("Add to Cart");
        addToCartItem11.setBorder(null);
        addToCartItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartItem11ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 0, 51));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("359");

        javax.swing.GroupLayout item11Layout = new javax.swing.GroupLayout(item11);
        item11.setLayout(item11Layout);
        item11Layout.setHorizontalGroup(
            item11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(item11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item11Image, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(addToCartItem11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        item11Layout.setVerticalGroup(
            item11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item11Image, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addToCartItem11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        item12.setPreferredSize(new java.awt.Dimension(130, 200));

        item12Image.setBorder(null);
        item12Image.setMargin(new java.awt.Insets(0, 0, 0, 0));
        item12Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item12ImageActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html>Kang the Conqueror T-shirt</html>");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        addToCartItem12.setBackground(new java.awt.Color(244, 0, 51));
        addToCartItem12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        addToCartItem12.setForeground(new java.awt.Color(255, 255, 255));
        addToCartItem12.setText("Add to Cart");
        addToCartItem12.setBorder(null);
        addToCartItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartItem12ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 0, 51));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("999");

        javax.swing.GroupLayout item12Layout = new javax.swing.GroupLayout(item12);
        item12.setLayout(item12Layout);
        item12Layout.setHorizontalGroup(
            item12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(item12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item12Image, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(addToCartItem12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        item12Layout.setVerticalGroup(
            item12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, item12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item12Image, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addToCartItem12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        item6.setPreferredSize(new java.awt.Dimension(130, 200));

        item6Image.setBorder(null);
        item6Image.setMargin(new java.awt.Insets(0, 0, 0, 0));
        item6Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item6ImageActionPerformed(evt);
            }
        });

        addToCartItem6.setBackground(new java.awt.Color(244, 0, 51));
        addToCartItem6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        addToCartItem6.setForeground(new java.awt.Color(255, 255, 255));
        addToCartItem6.setText("Add to Cart");
        addToCartItem6.setBorder(null);
        addToCartItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartItem6ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("<html>Gaara of the Sand T-shirt</html>");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("599");

        javax.swing.GroupLayout item6Layout = new javax.swing.GroupLayout(item6);
        item6.setLayout(item6Layout);
        item6Layout.setHorizontalGroup(
            item6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(item6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(addToCartItem6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(item6Image, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        item6Layout.setVerticalGroup(
            item6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, item6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item6Image, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addToCartItem6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout productDisplayPanelLayout = new javax.swing.GroupLayout(productDisplayPanel);
        productDisplayPanel.setLayout(productDisplayPanelLayout);
        productDisplayPanelLayout.setHorizontalGroup(
            productDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productDisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(productDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productDisplayPanelLayout.createSequentialGroup()
                        .addComponent(item8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(item9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(item10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(item11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(item12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(productDisplayPanelLayout.createSequentialGroup()
                        .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(item5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(item6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        productDisplayPanelLayout.setVerticalGroup(
            productDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productDisplayPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(productDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(productDisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(item7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(244, 0, 51));

        welcomeText.setEditable(false);
        welcomeText.setBackground(new java.awt.Color(244, 0, 51));
        welcomeText.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        welcomeText.setForeground(new java.awt.Color(255, 255, 255));
        welcomeText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        welcomeText.setText("HELLO ROHAN");
        welcomeText.setBorder(null);
        welcomeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                welcomeTextActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(244, 0, 51));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Menu");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(244, 0, 51));
        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Log Out");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        moveToCart.setBackground(new java.awt.Color(244, 0, 51));
        moveToCart.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        moveToCart.setForeground(new java.awt.Color(255, 255, 255));
        moveToCart.setText("Cart");
        moveToCart.setBorder(null);
        moveToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveToCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeText, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moveToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton6)
                    .addComponent(moveToCart))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLayeredPane2.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(productDisplayPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(productDisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(productDisplayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void welcomeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_welcomeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomeTextActionPerformed

    private void figuresOnlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_figuresOnlyActionPerformed
        item1.setVisible(true);
        item2.setVisible(true);
        item3.setVisible(false);
        item4.setVisible(false);
        item5.setVisible(false);
        item6.setVisible(false);
        item7.setVisible(true);
        item8.setVisible(true);
        item9.setVisible(false);
        item10.setVisible(true);
        item11.setVisible(false);
        item12.setVisible(false);
    }//GEN-LAST:event_figuresOnlyActionPerformed

    private void keychainsOnlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keychainsOnlyActionPerformed
        item1.setVisible(false);
        item2.setVisible(false);
        item3.setVisible(false);
        item4.setVisible(true);
        item5.setVisible(false);
        item6.setVisible(false);
        item7.setVisible(false);
        item8.setVisible(false);
        item9.setVisible(true);
        item10.setVisible(false);
        item11.setVisible(false);
        item12.setVisible(false);
    }//GEN-LAST:event_keychainsOnlyActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(menuFlag){
            jPanel1.setVisible(true);
            menuFlag=false;
        }
        else{
            jPanel1.setVisible(false);
            menuFlag=true;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void allProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allProductsActionPerformed
        item1.setVisible(true);
        item2.setVisible(true);
        item3.setVisible(true);
        item4.setVisible(true);
        item5.setVisible(true);
        item6.setVisible(true);
        item7.setVisible(true);
        item8.setVisible(true);
        item9.setVisible(true);
        item10.setVisible(true);
        item11.setVisible(true);
        item12.setVisible(true);
    }//GEN-LAST:event_allProductsActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void clothesOnlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clothesOnlyActionPerformed
        item1.setVisible(false);
        item2.setVisible(false);
        item3.setVisible(false);
        item4.setVisible(false);
        item5.setVisible(true);
        item6.setVisible(true);
        item7.setVisible(false);
        item8.setVisible(false);
        item9.setVisible(false);
        item10.setVisible(false);
        item11.setVisible(true);
        item12.setVisible(true);
    }//GEN-LAST:event_clothesOnlyActionPerformed

    private void item1ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1ImageActionPerformed
        new imagePop("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\naruto20thanniversary.png").setVisible(true);
    }//GEN-LAST:event_item1ImageActionPerformed

    private void item2ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2ImageActionPerformed
        new imagePop("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\kakashiactionfgiure.png").setVisible(true);
    }//GEN-LAST:event_item2ImageActionPerformed

    private void item3ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item3ImageActionPerformed
        new imagePop("C:\\\\Users\\\\HP\\\\Desktop\\\\sem3\\\\javaFilesPersonal\\\\javalab\\\\java cac 2\\\\merchandise store\\\\src\\\\merchandise\\\\store\\\\narutoallgenerationsposter.jpg").setVisible(true);
    }//GEN-LAST:event_item3ImageActionPerformed

    private void item4ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item4ImageActionPerformed
        new imagePop("C:\\\\Users\\\\HP\\\\Desktop\\\\sem3\\\\javaFilesPersonal\\\\javalab\\\\java cac 2\\\\merchandise store\\\\src\\\\merchandise\\\\store\\\\narutokeyring2.png").setVisible(true);
    }//GEN-LAST:event_item4ImageActionPerformed

    private void item5ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item5ImageActionPerformed
        new imagePop("C:\\\\Users\\\\HP\\\\Desktop\\\\sem3\\\\javaFilesPersonal\\\\javalab\\\\java cac 2\\\\merchandise store\\\\src\\\\merchandise\\\\store\\\\narutotshirt1.png").setVisible(true);
    }//GEN-LAST:event_item5ImageActionPerformed

    private void item6ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item6ImageActionPerformed
        new imagePop("C:\\\\Users\\\\HP\\\\Desktop\\\\sem3\\\\javaFilesPersonal\\\\javalab\\\\java cac 2\\\\merchandise store\\\\src\\\\merchandise\\\\store\\\\narutotshirt2.png").setVisible(true);
    }//GEN-LAST:event_item6ImageActionPerformed

    private void item7ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item7ImageActionPerformed
        new imagePop("C:\\\\Users\\\\HP\\\\Desktop\\\\sem3\\\\javaFilesPersonal\\\\javalab\\\\java cac 2\\\\merchandise store\\\\src\\\\merchandise\\\\store\\\\sasukeuchiha17cm.jpg").setVisible(true);
    }//GEN-LAST:event_item7ImageActionPerformed

    private void item8ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item8ImageActionPerformed
        new imagePop("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\spidermanbobblehead.jpg").setVisible(true);
    }//GEN-LAST:event_item8ImageActionPerformed

    private void item9ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item9ImageActionPerformed
        new imagePop("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\narutokeyring1.jpg").setVisible(true);
    }//GEN-LAST:event_item9ImageActionPerformed

    private void item10ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item10ImageActionPerformed
        new imagePop("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\narutorasenganactionfigure.jpg").setVisible(true);
    }//GEN-LAST:event_item10ImageActionPerformed

    private void item11ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item11ImageActionPerformed
        new imagePop("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\captshirt.png").setVisible(true);
    }//GEN-LAST:event_item11ImageActionPerformed

    private void item12ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item12ImageActionPerformed
        new imagePop("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\kangtshirt.png").setVisible(true);
    }//GEN-LAST:event_item12ImageActionPerformed

    private void addToCartItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartItem3ActionPerformed
        if( itemTracker[2] == false ){
            itemTracker[2] = true;
            addToCartItem3.setText("Remove Item");
        }
        else{
            itemTracker[2] = false;
            addToCartItem3.setText("Add to Cart");
        }
        this.addOrRemoveOperation(2);
    }//GEN-LAST:event_addToCartItem3ActionPerformed

    private void addToCartItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartItem2ActionPerformed
        if( itemTracker[1] == false ){
            itemTracker[1] = true;
            addToCartItem2.setText("Remove Item");
        }
        else{
            itemTracker[1] = false;
            addToCartItem2.setText("Add to Cart");
        }
        this.addOrRemoveOperation(1);
    }//GEN-LAST:event_addToCartItem2ActionPerformed

    private void addToCartItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartItem1ActionPerformed
        if( itemTracker[0] == false ){
            itemTracker[0] = true;
            addToCartItem1.setText("Remove Item");
        }
        else{
            itemTracker[0] = false;
            addToCartItem1.setText("Add to Cart");
        }
        this.addOrRemoveOperation(0);
    }//GEN-LAST:event_addToCartItem1ActionPerformed

    private void addToCartItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartItem11ActionPerformed
        if( itemTracker[10] == false ){
            itemTracker[10] = true;
            addToCartItem11.setText("Remove Item");
        }
        else{
            itemTracker[10] = false;
            addToCartItem11.setText("Add to Cart");
        }
        this.addOrRemoveOperation(10);
    }//GEN-LAST:event_addToCartItem11ActionPerformed

    private void addToCartItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartItem8ActionPerformed
        if( itemTracker[7] == false ){
            itemTracker[7] = true;
            addToCartItem8.setText("Remove Item");
        }
        else{
            itemTracker[7] = false;
            addToCartItem8.setText("Add to Cart");
        }
        this.addOrRemoveOperation(7);
    }//GEN-LAST:event_addToCartItem8ActionPerformed

    private void addToCartItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartItem12ActionPerformed
        if( itemTracker[11] == false ){
            itemTracker[11] = true;
            addToCartItem12.setText("Remove Item");
        }
        else{
            itemTracker[11] = false;
            addToCartItem12.setText("Add to Cart");
        }
        this.addOrRemoveOperation(11);
    }//GEN-LAST:event_addToCartItem12ActionPerformed

    private void addToCartItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartItem10ActionPerformed
        if( itemTracker[9] == false ){
            itemTracker[9] = true;
            addToCartItem10.setText("Remove Item");
        }
        else{
            itemTracker[9] = false;
            addToCartItem10.setText("Add to Cart");
        }
        this.addOrRemoveOperation(9);
    }//GEN-LAST:event_addToCartItem10ActionPerformed

    private void addToCartItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartItem9ActionPerformed
        if( itemTracker[8] == false ){
            itemTracker[8] = true;
            addToCartItem9.setText("Remove Item");
        }
        else{
            itemTracker[8] = false;
            addToCartItem9.setText("Add to Cart");
        }
        this.addOrRemoveOperation(8);
    }//GEN-LAST:event_addToCartItem9ActionPerformed

    private void addToCartItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartItem7ActionPerformed
        if( itemTracker[6] == false ){
            itemTracker[6] = true;
            addToCartItem7.setText("Remove Item");
        }
        else{
            itemTracker[6] = false;
            addToCartItem7.setText("Add to Cart");
        }
        this.addOrRemoveOperation(6);
    }//GEN-LAST:event_addToCartItem7ActionPerformed

    private void addToCartItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartItem6ActionPerformed
        if( itemTracker[5] == false ){
            itemTracker[5] = true;
            addToCartItem6.setText("Remove Item");
        }
        else{
            itemTracker[5] = false;
            addToCartItem6.setText("Add to Cart");
        }
        this.addOrRemoveOperation(5);
    }//GEN-LAST:event_addToCartItem6ActionPerformed

    private void addToCartItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartItem5ActionPerformed
        if( itemTracker[4] == false ){
            itemTracker[4] = true;
            addToCartItem5.setText("Remove Item");
        }
        else{
            itemTracker[4] = false;
            addToCartItem5.setText("Add to Cart");
        }
        this.addOrRemoveOperation(4);
    }//GEN-LAST:event_addToCartItem5ActionPerformed

    private void addToCartItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartItem4ActionPerformed
        if( itemTracker[3] == false ){
            itemTracker[3] = true;
            addToCartItem4.setText("Remove Item");
        }
        else{
            itemTracker[3] = false;
            addToCartItem4.setText("Add to Cart");
        }
        this.addOrRemoveOperation(3);
        
    }//GEN-LAST:event_addToCartItem4ActionPerformed
    
    private void addOrRemoveOperation(int index){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/javacac","root", "rookierohan");
            
            String tableName = username+"Cart";
            Statement stmt;
            ResultSet set;
            
            if(itemTracker[index] == true){
                System.out.println("Trying to insert");
                String q = "insert into "+tableName+" values("+index+")";
                stmt = con.createStatement();
                stmt.execute(q);
                itemTracker[index] = false;
            }
            else{
                System.out.println("Trying to delete");            
                String q = "delete from "+tableName+" where id="+index;
                stmt =con.createStatement();
                stmt.execute(q);
                itemTracker[index] = true;
            }
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Connection not successful");
        }
    }
    
    private void moveToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveToCartActionPerformed
        new addToCartScreen(username).setVisible(true);
        dispose();
    }//GEN-LAST:event_moveToCartActionPerformed

//    icon[0]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\naruto20thanniversary.png");
//        icon[1]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\kakashiactionfgiure.png");
//        icon[2]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\narutoallgenerationsposter.jpg");
//        icon[3]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\narutokeyring2.png");
//        icon[4]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\narutotshirt1.png");
//        icon[5]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\narutotshirt2.png");
//        icon[6]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\sasukeuchiha17cm.jpg");
//        icon[7]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\spidermanbobblehead.jpg");
//        icon[8]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\narutokeyring1.jpg");
//        icon[9]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\narutorasenganactionfigure.jpg");
//        icon[10]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\captshirt.png");
//        icon[11]=new ImageIcon("C:\\Users\\HP\\Desktop\\sem3\\javaFilesPersonal\\javalab\\java cac 2\\merchandise store\\src\\merchandise\\store\\kangtshirt.png");
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartItem1;
    private javax.swing.JButton addToCartItem10;
    private javax.swing.JButton addToCartItem11;
    private javax.swing.JButton addToCartItem12;
    private javax.swing.JButton addToCartItem2;
    private javax.swing.JButton addToCartItem3;
    private javax.swing.JButton addToCartItem4;
    private javax.swing.JButton addToCartItem5;
    private javax.swing.JButton addToCartItem6;
    private javax.swing.JButton addToCartItem7;
    private javax.swing.JButton addToCartItem8;
    private javax.swing.JButton addToCartItem9;
    private javax.swing.JButton allProducts;
    private javax.swing.JButton clothesOnly;
    private javax.swing.JButton figuresOnly;
    private javax.swing.JPanel item1;
    private javax.swing.JPanel item10;
    private javax.swing.JButton item10Image;
    private javax.swing.JPanel item11;
    private javax.swing.JButton item11Image;
    private javax.swing.JPanel item12;
    private javax.swing.JButton item12Image;
    private javax.swing.JButton item1Image;
    private javax.swing.JPanel item2;
    private javax.swing.JButton item2Image;
    private javax.swing.JPanel item3;
    private javax.swing.JButton item3Image;
    private javax.swing.JPanel item4;
    private javax.swing.JButton item4Image;
    private javax.swing.JPanel item5;
    private javax.swing.JButton item5Image;
    private javax.swing.JPanel item6;
    private javax.swing.JButton item6Image;
    private javax.swing.JPanel item7;
    private javax.swing.JButton item7Image;
    private javax.swing.JPanel item8;
    private javax.swing.JButton item8Image;
    private javax.swing.JPanel item9;
    private javax.swing.JButton item9Image;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton keychainsOnly;
    private javax.swing.JButton moveToCart;
    private javax.swing.JPanel productDisplayPanel;
    private javax.swing.JTextField welcomeText;
    // End of variables declaration//GEN-END:variables
}
