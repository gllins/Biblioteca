package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import dao.LivroDAO;
import model.Livro;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class AdicionarLivro extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField titulo;
	private JTextField autor;
	private JTextField paginas;
	private JTextField editora;
	private JTextField ano;
	private JTextField avaliacao;
	private JTextField idioma;
	private JLabel lblimagem;
	private FileInputStream fis;
	private int tamanho;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdicionarLivro frame = new AdicionarLivro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdicionarLivro() {
		setTitle("Adicionar Livro");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Downloads\\61f45ccfaeacba10aec9faab6775992a.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Adicionar Livro");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(148, 11, 138, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Título");
		lblNewLabel_1.setBounds(10, 55, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Autor");
		lblNewLabel_2.setBounds(10, 85, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Páginas");
		lblNewLabel_3.setBounds(10, 110, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Editora");
		lblNewLabel_4.setBounds(10, 136, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ano");
		lblNewLabel_5.setBounds(10, 161, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Avaliação");
		lblNewLabel_6.setBounds(10, 186, 67, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Idioma");
		lblNewLabel_7.setBounds(10, 213, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		titulo = new JTextField();
		titulo.setBounds(66, 52, 158, 20);
		contentPane.add(titulo);
		titulo.setColumns(10);
		
		autor = new JTextField();
		autor.setBounds(66, 82, 158, 20);
		contentPane.add(autor);
		autor.setColumns(10);
		
		paginas = new JTextField();
		paginas.setBounds(66, 107, 158, 20);
		contentPane.add(paginas);
		paginas.setColumns(10);
		
		editora = new JTextField();
		editora.setBounds(66, 133, 158, 20);
		contentPane.add(editora);
		editora.setColumns(10);
		
		ano = new JTextField();
		ano.setBounds(66, 158, 158, 20);
		contentPane.add(ano);
		ano.setColumns(10);
		
		avaliacao = new JTextField();
		avaliacao.setBounds(66, 182, 158, 20);
		contentPane.add(avaliacao);
		avaliacao.setColumns(10);
		
		idioma = new JTextField();
		idioma.setBounds(66, 210, 158, 20);
		contentPane.add(idioma);
		idioma.setColumns(10);
		
		lblimagem = new JLabel();
		
		JButton btnNewButton = new JButton("Add Livro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			      /**************************************************************/
		        Livro l  = new Livro();
            	
            	l.setTitulo(titulo.getText());
            	l.setAutor(autor.getText());
            	l.setPaginas(Integer.parseInt(paginas.getText()));
            	l.setEditora(editora.getText());
            	l.setAno(Integer.parseInt(ano.getText()));
            	l.setAvaliacao(Double.parseDouble(avaliacao.getText()));
            	l.setIdioma(idioma.getText());
       
                LivroDAO ld = new LivroDAO();
                
               ld.save(l);
               /**************************************************************/
		        
		        
		        System.out.println("Livro cadastrado:");
		        System.out.println("Título: " + l.getTitulo());
		        System.out.println("Autor: " + l.getAutor());
		        System.out.println("Páginas: " + l.getPaginas());
		        System.out.println("Editora: " + l.getEditora());
		        System.out.println("Ano: " + l.getAno());
		        System.out.println("Avaliação: " + l.getAvaliacao());
		        System.out.println("Idioma: " + l.getIdioma());
		        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
		   
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Gerenciamento gerenciamento = new Gerenciamento();
			        
			        
			        gerenciamento.setVisible(true);
			        
			         AdicionarLivro.this.dispose();
			
			}
		});
		btnNewButton_1.setBounds(236, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnCarregar = new JButton("Carregar img");
		btnCarregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarImagem();
				
				
			}
		});
		btnCarregar.setBounds(49, 238, 177, 23);
		contentPane.add(btnCarregar);
		
		JLabel lblimagem = new JLabel("");
		lblimagem.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblimagem.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\Biblioteca (1).png"));
		lblimagem.setBounds(210, 52, 219, 170);
		contentPane.add(lblimagem);
		
		
		}
		private void carregarImagem() {
			JFileChooser jfc = new JFileChooser();
			jfc.setDialogTitle("Selecionar Arquivo");
			jfc.setFileFilter(new FileNameExtensionFilter("Arquivo de imagens (*PNG,*.JPG,*.JPEG", "png","jpg","jpeg"));
			int resultado = jfc.showOpenDialog(this);
			if (resultado == JFileChooser.APPROVE_OPTION) {
				try {
					
					System.out.println("entrei no IF");
					fis = new FileInputStream(jfc.getSelectedFile());
					tamanho = (int) jfc.getSelectedFile().length();
					
					System.out.println(jfc.getSelectedFile().getAbsoluteFile());
					//Image imagem = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(lblimagem.getWidth(), lblimagem.getHeight(),Image.SCALE_SMOOTH);
					ImageIcon  ic = new ImageIcon("resources\renegados.jpg");  //C:\Users\USER\Desktop\livros\renegados.jpg
					//lblimagem.setIcon(new ImageIcon(imagem));
					lblimagem.setIcon(ic);
					System.out.println("setoua imagem 2");
					lblimagem.updateUI();
				} catch (Exception e) {
					System.out.println(e);
				
				}
			} 
		}

		public FileInputStream getFis() {
			return fis;
		}

		public void setFis(FileInputStream fis) {
			this.fis = fis;
		}

		public int getTamanho() {
			return tamanho;
		}

		public void setTamanho(int tamanho) {
			this.tamanho = tamanho;
		}
	}
	
