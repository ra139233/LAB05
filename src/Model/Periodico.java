/**
 */
package Model;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Periodico#getNome <em>Nome</em>}</li>
 *   <li>{@link Model.Periodico#getEditor <em>Editor</em>}</li>
 *   <li>{@link Model.Periodico#getPeridiocidade <em>Peridiocidade</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getPeriodico()
 * @model
 * @generated
 */
public interface Periodico extends Publicacao {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see Model.ModelPackage#getPeriodico_Nome()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link Model.Periodico#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Editor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editor</em>' attribute.
	 * @see #setEditor(String)
	 * @see Model.ModelPackage#getPeriodico_Editor()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEditor();

	/**
	 * Sets the value of the '{@link Model.Periodico#getEditor <em>Editor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editor</em>' attribute.
	 * @see #getEditor()
	 * @generated
	 */
	void setEditor(String value);

	/**
	 * Returns the value of the '<em><b>Peridiocidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peridiocidade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peridiocidade</em>' attribute.
	 * @see #setPeridiocidade(Date)
	 * @see Model.ModelPackage#getPeriodico_Peridiocidade()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getPeridiocidade();

	/**
	 * Sets the value of the '{@link Model.Periodico#getPeridiocidade <em>Peridiocidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peridiocidade</em>' attribute.
	 * @see #getPeridiocidade()
	 * @generated
	 */
	void setPeridiocidade(Date value);

} // Periodico
