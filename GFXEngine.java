import java.awt.Color;
import java.awt.Image;
import java.awt.Graphics;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GFXEngine extends JPanel{
    static int tile = 64;
    static int boardOffset = 2*tile;
    static int boardTilesStart = boardOffset+tile;
    static int boardTilesEnd = boardOffset+tile + 8*tile;
    public static final String boardurl_default = "border.png";
    String boardurl = boardurl_default; 
    public static final String piecesurl_default = "set1.png";
    String piecesurl = piecesurl_default; 

    public void init() {
        System.out.println("===Start_of_GFXEngine===");
        // lvl 0 frame
        JFrame f = new JFrame("Chess");
        f.add(skinChooser());
        f.add(this);
        f.setSize(tile*14, tile*14);
        f.setBackground(new Color(218,160,109));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

    // this method auto-called
    @Override
    public void paintComponent(Graphics g){
       // super.paintComponent(g);
        drawBoard(g);
    }

    void drawBoard(Graphics g) {
        Image board_bg = new ImageIcon(boardurl).getImage();
        g.drawImage(board_bg, boardOffset, boardOffset, getFocusCycleRootAncestor());

        int dx1;
        int dx2;
        int dy1;
        int dy2;
        int sx1;
        int sx2;
        int sy1;
        int sy2;
        Image pieces = new ImageIcon(piecesurl).getImage();       
        for (int i=0; i <8; i++){
            for(int j=0; j<8; j++){
                switch (GameEngine.board[i][j]){
                    case 'A':
                        dx1=boardTilesStart+(j*tile);
                        dy1=boardTilesStart+(i*tile);
                        dx2=boardTilesStart+(j+1)*tile;
                        dy2=boardTilesStart+(i+1)*tile;
                        sx1=0;
                        sy1=0;
                        sx2=tile;
                        sy2=tile;
                        g.drawImage(pieces, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, getFocusCycleRootAncestor());    
                        break;
                    case 'Q':
                        dx1=boardTilesStart+j*tile;
                        dy1=boardTilesStart+i*tile;
                        dx2=boardTilesStart+(j+1)*tile;
                        dy2=boardTilesStart+(i+1)*tile;
                        sx1=tile;
                        sy1=0;
                        sx2=tile*2;
                        sy2=tile;
                        g.drawImage(pieces, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, getFocusCycleRootAncestor());    
                        break; 
                    case 'B':
                        dx1=boardTilesStart+j*tile;
                        dy1=boardTilesStart+i*tile;
                        dx2=boardTilesStart+(j+1)*tile;
                        dy2=boardTilesStart+(i+1)*tile;
                        sx1=tile*3;
                        sy1=0;
                        sx2=tile*4;
                        sy2=tile;
                        g.drawImage(pieces, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, getFocusCycleRootAncestor());    
                        break; 
                    case 'K': 
                        dx1=boardTilesStart+j*tile;
                        dy1=boardTilesStart+i*tile;
                        dx2=boardTilesStart+(j+1)*tile;
                        dy2=boardTilesStart+(i+1)*tile;
                        sx1=tile*4;
                        sy1=0;
                        sx2=tile*5;
                        sy2=tile;
                        g.drawImage(pieces, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, getFocusCycleRootAncestor());    
                        break; 
                    case 'R': 
                        dx1=boardTilesStart+j*tile;
                        dy1=boardTilesStart+i*tile;
                        dx2=boardTilesStart+(j+1)*tile;
                        dy2=boardTilesStart+(i+1)*tile;
                        sx1=tile*2;
                        sy1=0;
                        sx2=tile*3;
                        sy2=tile;
                        g.drawImage(pieces, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, getFocusCycleRootAncestor());    
                        break;    
                    case 'P': 
                        dx1=boardTilesStart+j*tile;
                        dy1=boardTilesStart+i*tile;
                        dx2=boardTilesStart+(j+1)*tile;
                        dy2=boardTilesStart+(i+1)*tile;
                        sx1=tile*5;
                        sy1=0;
                        sx2=tile*6;
                        sy2=tile;
                        g.drawImage(pieces, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, getFocusCycleRootAncestor());    
                    break; 
                    case 'a':
                        dx1=boardTilesStart+j*tile;
                        dy1=boardTilesStart+i*tile;
                        dx2=boardTilesStart+(j+1)*tile;
                        dy2=boardTilesStart+(i+1)*tile;
                        sx1=0;
                        sy1=tile;
                        sx2=tile;
                        sy2=tile*2;
                        g.drawImage(pieces, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, getFocusCycleRootAncestor());    
                        break;
                    case 'q':
                        dx1=boardTilesStart+j*tile;
                        dy1=boardTilesStart+i*tile;
                        dx2=boardTilesStart+(j+1)*tile;
                        dy2=boardTilesStart+(i+1)*tile;
                        sx1=tile;
                        sy1=tile;
                        sx2=tile*2;
                        sy2=tile*2;
                        g.drawImage(pieces, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, getFocusCycleRootAncestor());    
                        break; 
                    case 'b':
                        dx1=boardTilesStart+j*tile;
                        dy1=boardTilesStart+i*tile;
                        dx2=boardTilesStart+(j+1)*tile;
                        dy2=boardTilesStart+(i+1)*tile;
                        sx1=tile*3;
                        sy1=tile;
                        sx2=tile*4;
                        sy2=tile*2;
                        g.drawImage(pieces, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, getFocusCycleRootAncestor());    
                        break; 
                    case 'k': 
                        dx1=boardTilesStart+j*tile;
                        dy1=boardTilesStart+i*tile;
                        dx2=boardTilesStart+(j+1)*tile;
                        dy2=boardTilesStart+(i+1)*tile;
                        sx1=tile*4;
                        sy1=tile;
                        sx2=tile*5;
                        sy2=tile*2;
                        g.drawImage(pieces, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, getFocusCycleRootAncestor());    
                        break; 
                    case 'r': 
                        dx1=boardTilesStart+j*tile;
                        dy1=boardTilesStart+i*tile;
                        dx2=boardTilesStart+(j+1)*tile;
                        dy2=boardTilesStart+(i+1)*tile;
                        sx1=tile*2;
                        sy1=tile;
                        sx2=tile*3;
                        sy2=tile*2;
                        g.drawImage(pieces, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, getFocusCycleRootAncestor());    
                        break;    
                    case 'p': 
                        dx1=boardTilesStart+j*tile;
                        dy1=boardTilesStart+i*tile;
                        dx2=boardTilesStart+(j+1)*tile;
                        dy2=boardTilesStart+(i+1)*tile;
                        sx1=tile*5;
                        sy1=tile;
                        sx2=tile*6;
                        sy2=tile*2;
                        g.drawImage(pieces, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, getFocusCycleRootAncestor());    
                        break;
                }
            }
        
        
        }
        movePieceImage();
    }

    JPanel skinChooser() {
        JPanel skinp = new JPanel();
        JRadioButton option1 = new JRadioButton("green");
        JRadioButton option2 = new JRadioButton("brown");
        // add both buttons in the same group for mutual exclusiveness
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);

        ChangeListener changeListener = new ChangeListener() {
            public void stateChanged(ChangeEvent changEvent) {

            }
        };
        
        option1.addChangeListener(changeListener);
        option2.addChangeListener(changeListener);

        skinp.setLocation(6*tile, 0);
        skinp.setSize(2*tile,tile);
        skinp.setVisible(true);
        skinp.setBackground(Color.darkGray);
        skinp.add(option1);
        skinp.add(option2);
        skinp.setLayout(getLayout());
        return skinp;
    }

    void movePieceImage(){
    }
}