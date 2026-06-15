import javax.swing.*;
import java.awt.*;

public class SistemaBibliotecaGUI extends JFrame {

    public SistemaBibliotecaGUI() {

        setTitle("📚 Biblioteca Digital");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setBackground(new Color(30, 30, 30));
        painelPrincipal.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("📚 BIBLIOTECA DIGITAL", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        titulo.setForeground(Color.WHITE);
        titulo.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        JPanel formulario = new JPanel(new GridLayout(3,2,10,10));
        formulario.setBackground(new Color(45,45,45));

        JTextField txtTitulo = new JTextField();
        JTextField txtAutor = new JTextField();

        formulario.add(criarLabel("📖 Título"));
        formulario.add(txtTitulo);

        formulario.add(criarLabel("✍️ Autor"));
        formulario.add(txtAutor);

        JButton cadastrar = new JButton("➕ Cadastrar");
        JButton limpar = new JButton("🗑️ Limpar");

        formulario.add(cadastrar);
        formulario.add(limpar);

        JTextArea area = new JTextArea();
        area.setFont(new Font("Arial", Font.PLAIN, 14));

        cadastrar.addActionListener(e -> {
            area.append(
                "📚 " + txtTitulo.getText() +
                "\n✍️ " + txtAutor.getText() +
                "\n────────────────────\n"
            );
        });

        limpar.addActionListener(e -> {
            txtTitulo.setText("");
            txtAutor.setText("");
        });

        painelPrincipal.add(titulo, BorderLayout.NORTH);
        painelPrincipal.add(formulario, BorderLayout.CENTER);
        painelPrincipal.add(new JScrollPane(area), BorderLayout.SOUTH);

        add(painelPrincipal);
    }

    private JLabel criarLabel(String texto) {
        JLabel lbl = new JLabel(texto);
        lbl.setForeground(Color.WHITE);
        lbl.setFont(new Font("Arial", Font.BOLD, 16));
        return lbl;
    }

    public static void main(String[] args) {
        new SistemaBibliotecaGUI().setVisible(true);
    }
}
