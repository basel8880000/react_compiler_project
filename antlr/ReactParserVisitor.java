// Generated from C:/Users/2020/IdeaProjects/react-complier/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReactParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReactParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReactParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ReactParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useStateDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStateDecl(ReactParser.UseStateDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useStateVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStateVal(ReactParser.UseStateValContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ReactParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(ReactParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(ReactParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(ReactParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(ReactParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#pureReact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureReact(ReactParser.PureReactContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#reactElelment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReactElelment(ReactParser.ReactElelmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#attributeR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeR(ReactParser.AttributeRContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#valObjList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValObjList(ReactParser.ValObjListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#ifState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfState(ReactParser.IfStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(ReactParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ReactParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj(ReactParser.ObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#varObj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarObj(ReactParser.VarObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ReactParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(ReactParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsx(ReactParser.JsxContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(ReactParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#emptyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyElement(ReactParser.EmptyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#normalElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalElement(ReactParser.NormalElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(ReactParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ReactParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#css}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss(ReactParser.CssContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxExp(ReactParser.JsxExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(ReactParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#imgElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImgElement(ReactParser.ImgElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(ReactParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#comAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComAttribute(ReactParser.ComAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#imp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImp(ReactParser.ImpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#varimp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarimp(ReactParser.VarimpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(ReactParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(ReactParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#funBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunBody(ReactParser.FunBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(ReactParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(ReactParser.ExportContext ctx);
}