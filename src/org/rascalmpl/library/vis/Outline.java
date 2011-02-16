package org.rascalmpl.library.vis;

import org.eclipse.imp.pdb.facts.IConstructor;
import org.eclipse.imp.pdb.facts.IInteger;
import org.eclipse.imp.pdb.facts.IList;
import org.eclipse.imp.pdb.facts.IValue;
import org.rascalmpl.library.vis.properties.IPropertyManager;
import org.rascalmpl.library.vis.FigureColorUtils;

/**
 * Outline element: a rectangle with colored horizontal lines
 * 
 * @author paulk
 *
 */
public class Outline extends Figure {

	private boolean debug = false;
	private final IList lineInfo;
	private final int maxLine;

	public Outline(FigurePApplet fpa, IPropertyManager properties, IList lineInfo, IInteger maxLine) {
		super(fpa, properties);
		this.lineInfo = lineInfo;
		this.maxLine = maxLine.intValue();
	}

	@Override
	public
	void bbox(){
		float lw = getLineWidthProperty();
		width = getWidthProperty();
		height = getHeightProperty();
		width += 2*lw;
		height += 2*lw;
		if(debug) System.err.println("Outline.bbox => " + width + ", " + height);
		if(debug)System.err.printf("Outline.bbox: topAnchor=%f, bottomAnchor=%f\n", topAnchor(), bottomAnchor());
		
	}
	
	@Override
	public
	void draw(float left, float top) {
		this.setLeft(left);
		this.setTop(top);
		
		float lw = getLineWidthProperty();
		applyProperties();
		if(debug) System.err.println("Outline.draw => " + width + ", " + height);
		if(height > 0 && width > 0){
			fpa.rect(left, top, width, height);
			for(IValue v : lineInfo){
				IConstructor lineDecor = (IConstructor) v;
				int lino = ((IInteger) lineDecor.get(0)).intValue();
				String name = lineDecor.getName();
				
				int color;
				
				if(name.equals("info"))
					color = FigureColorUtils.figureColor(65,105,225); // royalblue
				else if(name.equals("warning"))
					color = FigureColorUtils.figureColor(246,211,87); // gold (like)
				else if(name.equals("error"))
				color = FigureColorUtils.figureColor(255,0,0); // red
				else {
					int highlightKind = 0;
					
					if(lineDecor.arity() > 2){
						highlightKind = ((IInteger)lineDecor.get(2)).intValue();
						if(highlightKind < 0)
							highlightKind = 0;
						if(highlightKind >= FigureColorUtils.highlightColors.length)
							highlightKind = FigureColorUtils.highlightColors.length - 1;
					}
					color = FigureColorUtils.getHighlightColor(highlightKind);
				}

				fpa.stroke(color);
				float vpos = top + (lino * height) /maxLine ;
				fpa.line(left + lw, vpos, left + width - lw, vpos);
			}
		}
	}
	
	@Override
	public boolean mouseOver(int mouseX, int mouseY, float centerX, float centerY, boolean mouseInParent){
		if(debug)System.err.println("Outline.MouseOver: " + this);
		if(mouseInside(mouseX, mouseY, centerX, centerY)){
		   fpa.registerMouseOver(this);
		   return true;
		}
		return false;
	}
	
	@Override
	public boolean mouseOver(int mouseX, int mouseY, boolean mouseInParent){
		if(debug)System.err.println("Outline.MouseOver: " + this);
		if(mouseInside(mouseX, mouseY)){
		   fpa.registerMouseOver(this);
		   return true;
		}
		return false;
	}
}
