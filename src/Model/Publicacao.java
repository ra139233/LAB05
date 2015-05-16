/**
 */
package Model;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publicacao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Publicacao#getAutor <em>Autor</em>}</li>
 *   <li>{@link Model.Publicacao#getDataPublicacao <em>Data Publicacao</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getPublicacao()
 * @model
 * @generated
 */
public interface Publicacao extends Exemplar {
	/**
	 * Returns the value of the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autor</em>' attribute.
	 * @see #setAutor(String)
	 * @see Model.ModelPackage#getPublicacao_Autor()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAutor();

	/**
	 * Sets the value of the '{@link Model.Publicacao#getAutor <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autor</em>' attribute.
	 * @see #getAutor()
	 * @generated
	 */
	void setAutor(String value);

	/**
	 * Returns the value of the '<em><b>Data Publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Publicacao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Publicacao</em>' attribute.
	 * @see #setDataPublicacao(Date)
	 * @see Model.ModelPackage#getPublicacao_DataPublicacao()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDataPublicacao();

	/**
	 * Sets the value of the '{@link Model.Publicacao#getDataPublicacao <em>Data Publicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Publicacao</em>' attribute.
	 * @see #getDataPublicacao()
	 * @generated
	 */
	void setDataPublicacao(Date value);

} // Publicacao
