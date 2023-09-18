package proyectofinal_minipython;

import java.util.Enumeration;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class AdminTree {

    private DefaultMutableTreeNode node;

    public AdminTree(DefaultMutableTreeNode node) {
        this.node = node;
    }

    public AdminTree() {
    }

    public DefaultMutableTreeNode getNode() {
        return node;
    }

    public void setNode(DefaultMutableTreeNode node) {
        this.node = node;
    }

    public void translate(DefaultMutableTreeNode root, JTextPane a) throws BadLocationException {

        StringBuilder code = new StringBuilder();

        for (int i = 0; i < root.getChildCount(); i++) {

            DefaultMutableTreeNode clases = (DefaultMutableTreeNode) root.getChildAt(i);

            String className = clases.getUserObject().toString();

            if (className.startsWith("Herencia: ")) {
                className = className.replace("Herencia: ", "");

                code.append("class ").append(className).append(": \n").append("     def __init__(self, ");

                DefaultMutableTreeNode padre = (DefaultMutableTreeNode) clases.getChildAt(0);
                DefaultMutableTreeNode atrisPadre = (DefaultMutableTreeNode) padre.getChildAt(0);
                DefaultMutableTreeNode metsPadre = (DefaultMutableTreeNode) padre.getChildAt(1);
                DefaultMutableTreeNode atris = (DefaultMutableTreeNode) clases.getChildAt(1);
                DefaultMutableTreeNode mets = (DefaultMutableTreeNode) clases.getChildAt(2);

                //constructor
                for (int j = 0; j < atris.getChildCount(); j++) {
                    DefaultMutableTreeNode atrisChildren = (DefaultMutableTreeNode) atris.getChildAt(j);

                    if (atris.getIndex((TreeNode) atrisChildren) == atris.getChildCount() - 1) {
                        code.append(atrisChildren.getUserObject().toString()).append("): \n");
                    } else {
                        code.append(atrisChildren.getUserObject().toString()).append(", ");
                    }

                }
                code.append("     ").append("     super().__init__(");
                //Constructor Padre
                for (int j = 0; j < atrisPadre.getChildCount(); j++) {
                    DefaultMutableTreeNode atrisChildrenParent = (DefaultMutableTreeNode) atrisPadre.getChildAt(j);
                    //String atributoPadre = atrisChildrenParent.getUserObject().toString();

                    if (atrisPadre.getIndex((TreeNode) atrisChildrenParent) == atrisPadre.getChildCount() - 1) {
                        code.append(atrisChildrenParent.getUserObject().toString()).append("): \n");
                    } else {
                        code.append(atrisChildrenParent.getUserObject().toString()).append(", ");
                    }

                }

                //Atributos individuales
                for (int j = 0; j < atris.getChildCount(); j++) {
                    DefaultMutableTreeNode atrisChildren = (DefaultMutableTreeNode) atris.getChildAt(j);

                    String atributo = atrisChildren.getUserObject().toString();

                    code.append("     ").append("     self.").append(atributo).append(" = ").append(atributo).append("\n");

                }
                //salto de linea para los metodos
                code.append("\n\n");

                //Abstractos
                for (int j = 0; j < metsPadre.getChildCount(); j++) {
                    DefaultMutableTreeNode metsChildren = (DefaultMutableTreeNode) metsPadre.getChildAt(j);
                    String metodo = metsChildren.getUserObject().toString();
                    if (metodo.startsWith("@")) {
                        metodo = metodo.replace("@", "");
                        code.append("     @Override\n").append("     ").append("def ").append(metodo).append("(self):\n").append("          ").append("pass\n\n");
                    } else {
                        code.append("     ").append("def ").append(metodo).append("(self):\n").append("          ").append("pass\n\n");

                    }

                }

                //metodos
                for (int j = 0; j < mets.getChildCount(); j++) {
                    DefaultMutableTreeNode metsChildren = (DefaultMutableTreeNode) mets.getChildAt(j);
                    String metodo = metsChildren.getUserObject().toString();

                    code.append("     ").append("def ").append(metodo).append("(self):\n").append("          ").append("pass\n\n");

                }

            } else if (className.startsWith("Abstracta: ")) {
                className = className.replace("Abstracta: ", "");
                // Genera código específico para clases abstractas aquí

                code.append("from abc import ABC, abstractmethod\n\n").append("class ").append(className).append(": \n").append("     def __init__(self, ");

                DefaultMutableTreeNode atris = (DefaultMutableTreeNode) clases.getChildAt(0);
                DefaultMutableTreeNode mets = (DefaultMutableTreeNode) clases.getChildAt(1);

                //atributos
                for (int j = 0; j < atris.getChildCount(); j++) {
                    DefaultMutableTreeNode atrisChildren = (DefaultMutableTreeNode) atris.getChildAt(j);

                    if (atris.getIndex((TreeNode) atrisChildren) == atris.getChildCount() - 1) {
                        code.append(atrisChildren.getUserObject().toString()).append("): \n");
                    } else {
                        code.append(atrisChildren.getUserObject().toString()).append(", ");
                    }

                }
                for (int j = 0; j < atris.getChildCount(); j++) {
                    DefaultMutableTreeNode atrisChildren = (DefaultMutableTreeNode) atris.getChildAt(j);

                    String atributo = atrisChildren.getUserObject().toString();

                    code.append("     ").append("     self.").append(atributo).append(" = ").append(atributo).append("\n");

                }
                //salto de linea para los metodos
                code.append("\n\n");

                //metodos
                for (int j = 0; j < mets.getChildCount(); j++) {
                    DefaultMutableTreeNode metsChildren = (DefaultMutableTreeNode) mets.getChildAt(j);
                    String metodo = metsChildren.getUserObject().toString();

                    if (metodo.startsWith("@")) {
                        metodo = metodo.replace("@", "");
                        code.append("     @abstractmethod\n").append("     ").append("def ").append(metodo).append("(self):\n").append("          ").append("pass\n\n");
                    } else {
                        code.append("     ").append("def ").append(metodo).append("(self):\n").append("          ").append("pass\n\n");

                    }

                }

            } else if (className.startsWith("Interfaz: ")) {

                className = className.replace("Interfaz: ", "");
                // Genera código específico para clases abstractas aquí

                code.append("#Interfaz\n").append("from abc import ABC, abstractmethod\n\n").append("class ").append(className).append(": \n").append("     def __init__(self, ");

                DefaultMutableTreeNode atris = (DefaultMutableTreeNode) clases.getChildAt(0);
                DefaultMutableTreeNode mets = (DefaultMutableTreeNode) clases.getChildAt(1);

                //atributos
                for (int j = 0; j < atris.getChildCount(); j++) {
                    DefaultMutableTreeNode atrisChildren = (DefaultMutableTreeNode) atris.getChildAt(j);

                    if (atris.getIndex((TreeNode) atrisChildren) == atris.getChildCount() - 1) {
                        code.append(atrisChildren.getUserObject().toString()).append("): \n");
                    } else {
                        code.append(atrisChildren.getUserObject().toString()).append(", ");
                    }

                }
                for (int j = 0; j < atris.getChildCount(); j++) {
                    DefaultMutableTreeNode atrisChildren = (DefaultMutableTreeNode) atris.getChildAt(j);

                    String atributo = atrisChildren.getUserObject().toString();

                    code.append("     ").append("     self.").append(atributo).append(" = ").append(atributo).append("\n");

                }
                //salto de linea para los metodos
                code.append("\n\n");

                //metodos
                for (int j = 0; j < mets.getChildCount(); j++) {
                    DefaultMutableTreeNode metsChildren = (DefaultMutableTreeNode) mets.getChildAt(j);
                    String metodo = metsChildren.getUserObject().toString();

                    if (metodo.startsWith("@")) {
                        metodo = metodo.replace("@", "");
                        code.append("     @abstractmethod\n").append("     ").append("def ").append(metodo).append("(self):\n").append("          ").append("pass\n\n");
                    } else {
                        //code.append("     ").append("def ").append(metodo).append("(self):\n").append("          ").append("pass\n\n");

                    }

                }

            } else if (className.startsWith("Simple: ")) {
                className = className.replace("Simple: ", "");
                code.append("class ").append(className).append(": \n").append("     def __init__(self, ");

                DefaultMutableTreeNode atris = (DefaultMutableTreeNode) clases.getChildAt(0);
                DefaultMutableTreeNode mets = (DefaultMutableTreeNode) clases.getChildAt(1);

                //atributos
                for (int j = 0; j < atris.getChildCount(); j++) {
                    DefaultMutableTreeNode atrisChildren = (DefaultMutableTreeNode) atris.getChildAt(j);

                    if (atris.getIndex((TreeNode) atrisChildren) == atris.getChildCount() - 1) {
                        code.append(atrisChildren.getUserObject().toString()).append("): \n");
                    } else {
                        code.append(atrisChildren.getUserObject().toString()).append(", ");
                    }

                }
                for (int j = 0; j < atris.getChildCount(); j++) {
                    DefaultMutableTreeNode atrisChildren = (DefaultMutableTreeNode) atris.getChildAt(j);

                    String atributo = atrisChildren.getUserObject().toString();

                    code.append("     ").append("     self.").append(atributo).append(" = ").append(atributo).append("\n");

                }
                //salto de linea para los metodos
                code.append("\n\n");

                //metodos
                for (int j = 0; j < mets.getChildCount(); j++) {
                    DefaultMutableTreeNode metsChildren = (DefaultMutableTreeNode) mets.getChildAt(j);
                    String metodo = metsChildren.getUserObject().toString();

                    code.append("     ").append("def ").append(metodo).append("(self):\n").append("          ").append("pass\n\n");

                }
            }

        }

        //Permite escribir sobre el jtextpane
        Document doc = a.getDocument();
        doc.insertString(doc.getLength(), code.toString(), null);

    }

}
