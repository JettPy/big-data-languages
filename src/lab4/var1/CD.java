package lab4.var1;

import java.util.ArrayList;

public class CD {
    private final String name;
    private final Document root;

    public class Document {
        private final boolean isFile;
        private final String name;
        private final ArrayList<Document> documents;

        public Document(String name, boolean isFile) {
            this.name = name;
            this.isFile = isFile;
            if (isFile) {
                this.documents = null;
            } else{
                this.documents = new ArrayList<>();
            }
        }

        public String getName() {
            return name;
        }
    }

    public CD(String name) {
        this.name = name;
        root = new Document(name, false);
    }

    public void addFile(String path) {
        String[] tokens = path.split("/");
        Document currDoc = root;
        for (int i = 0; i < tokens.length; i++) {
            if (!currDoc.isFile) {
                if (currDoc.documents.size() > 0) {
                    boolean found = false;
                    for (Document doc: currDoc.documents) {
                        if (doc.name.equals(tokens[i])) {
                            currDoc = doc;
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        Document new_doc = new Document(tokens[i], i == tokens.length - 1);
                        currDoc.documents.add(new_doc);
                        currDoc = new_doc;
                    }
                } else {
                    Document new_doc = new Document(tokens[i], i == tokens.length - 1);
                    currDoc.documents.add(new_doc);
                    currDoc = new_doc;
                }
            }
        }
    }

    public void tree() {
        System.out.println("CD: " + this.name + ":");
        tree_part(root, 0);
    }

    private void tree_part(Document doc, int tabs) {
        for (int i = 0; i < tabs; i++) {
            System.out.print("-");
        }
        if (doc.isFile) {
            System.out.println(doc.name);
        } else {
            System.out.println(doc.name);
            for (Document next: doc.documents) {
                tree_part(next,tabs + 2);
            }
        }
    }
}
