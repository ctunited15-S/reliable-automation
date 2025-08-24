package com.sonatype;

import org.vandeseer.easytable.drawing.cell.ParagraphCellDrawer;
import org.vandeseer.easytable.structure.cell.paragraph.ParagraphCell;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ParagraphCellDrawer drawer = new ParagraphCellDrawer(ParagraphCell.builder().build());
        System.out.println(drawer.toString());
    }
}
