// Generated from C:/Users/2020/IdeaProjects/react-complier/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReactParser}.
 */
public interface ReactParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReactParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ReactParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ReactParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useStateDecl}.
	 * @param ctx the parse tree
	 */
	void enterUseStateDecl(ReactParser.UseStateDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useStateDecl}.
	 * @param ctx the parse tree
	 */
	void exitUseStateDecl(ReactParser.UseStateDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useStateVal}.
	 * @param ctx the parse tree
	 */
	void enterUseStateVal(ReactParser.UseStateValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useStateVal}.
	 * @param ctx the parse tree
	 */
	void exitUseStateVal(ReactParser.UseStateValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ReactParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ReactParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ReactParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ReactParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(ReactParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(ReactParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(ReactParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(ReactParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(ReactParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(ReactParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#pureReact}.
	 * @param ctx the parse tree
	 */
	void enterPureReact(ReactParser.PureReactContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#pureReact}.
	 * @param ctx the parse tree
	 */
	void exitPureReact(ReactParser.PureReactContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#reactElelment}.
	 * @param ctx the parse tree
	 */
	void enterReactElelment(ReactParser.ReactElelmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#reactElelment}.
	 * @param ctx the parse tree
	 */
	void exitReactElelment(ReactParser.ReactElelmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#attributeR}.
	 * @param ctx the parse tree
	 */
	void enterAttributeR(ReactParser.AttributeRContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#attributeR}.
	 * @param ctx the parse tree
	 */
	void exitAttributeR(ReactParser.AttributeRContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#valObjList}.
	 * @param ctx the parse tree
	 */
	void enterValObjList(ReactParser.ValObjListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#valObjList}.
	 * @param ctx the parse tree
	 */
	void exitValObjList(ReactParser.ValObjListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#ifState}.
	 * @param ctx the parse tree
	 */
	void enterIfState(ReactParser.IfStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#ifState}.
	 * @param ctx the parse tree
	 */
	void exitIfState(ReactParser.IfStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(ReactParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(ReactParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ReactParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ReactParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(ReactParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(ReactParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#varObj}.
	 * @param ctx the parse tree
	 */
	void enterVarObj(ReactParser.VarObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#varObj}.
	 * @param ctx the parse tree
	 */
	void exitVarObj(ReactParser.VarObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ReactParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ReactParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(ReactParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(ReactParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsx}.
	 * @param ctx the parse tree
	 */
	void enterJsx(ReactParser.JsxContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsx}.
	 * @param ctx the parse tree
	 */
	void exitJsx(ReactParser.JsxContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(ReactParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(ReactParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#emptyElement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyElement(ReactParser.EmptyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#emptyElement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyElement(ReactParser.EmptyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#normalElement}.
	 * @param ctx the parse tree
	 */
	void enterNormalElement(ReactParser.NormalElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#normalElement}.
	 * @param ctx the parse tree
	 */
	void exitNormalElement(ReactParser.NormalElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(ReactParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(ReactParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ReactParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ReactParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#css}.
	 * @param ctx the parse tree
	 */
	void enterCss(ReactParser.CssContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#css}.
	 * @param ctx the parse tree
	 */
	void exitCss(ReactParser.CssContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxExp}.
	 * @param ctx the parse tree
	 */
	void enterJsxExp(ReactParser.JsxExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxExp}.
	 * @param ctx the parse tree
	 */
	void exitJsxExp(ReactParser.JsxExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(ReactParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(ReactParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#imgElement}.
	 * @param ctx the parse tree
	 */
	void enterImgElement(ReactParser.ImgElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#imgElement}.
	 * @param ctx the parse tree
	 */
	void exitImgElement(ReactParser.ImgElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(ReactParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(ReactParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#comAttribute}.
	 * @param ctx the parse tree
	 */
	void enterComAttribute(ReactParser.ComAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#comAttribute}.
	 * @param ctx the parse tree
	 */
	void exitComAttribute(ReactParser.ComAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#imp}.
	 * @param ctx the parse tree
	 */
	void enterImp(ReactParser.ImpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#imp}.
	 * @param ctx the parse tree
	 */
	void exitImp(ReactParser.ImpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#varimp}.
	 * @param ctx the parse tree
	 */
	void enterVarimp(ReactParser.VarimpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#varimp}.
	 * @param ctx the parse tree
	 */
	void exitVarimp(ReactParser.VarimpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterFun(ReactParser.FunContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitFun(ReactParser.FunContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(ReactParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(ReactParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#funBody}.
	 * @param ctx the parse tree
	 */
	void enterFunBody(ReactParser.FunBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#funBody}.
	 * @param ctx the parse tree
	 */
	void exitFunBody(ReactParser.FunBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(ReactParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(ReactParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#export}.
	 * @param ctx the parse tree
	 */
	void enterExport(ReactParser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#export}.
	 * @param ctx the parse tree
	 */
	void exitExport(ReactParser.ExportContext ctx);
}