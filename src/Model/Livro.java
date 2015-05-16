/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Livro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Livro#getNome <em>Nome</em>}</li>
 *   <li>{@link Model.Livro#getEditora <em>Editora</em>}</li>
 *   <li>{@link Model.Livro#getEdicao <em>Edicao</em>}</li>
 *   <li>{@link Model.Livro#getVolume <em>Volume</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getLivro()
 * @model
 * @generated
 */
public interface Livro extends Publicacao {
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
	 * @see Model.ModelPackage#getLivro_Nome()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link Model.Livro#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Editora</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editora</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editora</em>' attribute.
	 * @see #setEditora(String)
	 * @see Model.ModelPackage#getLivro_Editora()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEditora();

	/**
	 * Sets the value of the '{@link Model.Livro#getEditora <em>Editora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editora</em>' attribute.
	 * @see #getEditora()
	 * @generated
	 */
	void setEditora(String value);

	/**
	 * Returns the value of the '<em><b>Edicao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edicao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edicao</em>' attribute.
	 * @see #setEdicao(int)
	 * @see Model.ModelPackage#getLivro_Edicao()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getEdicao();

	/**
	 * Sets the value of the '{@link Model.Livro#getEdicao <em>Edicao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edicao</em>' attribute.
	 * @see #getEdicao()
	 * @generated
	 */
	void setEdicao(int value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(int)
	 * @see Model.ModelPackage#getLivro_Volume()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getVolume();

	/**
	 * Sets the value of the '{@link Model.Livro#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(int value);

} // Livro
