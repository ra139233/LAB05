/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Periodico;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodico</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.PeriodicoImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link Model.impl.PeriodicoImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link Model.impl.PeriodicoImpl#getPeridiocidade <em>Peridiocidade</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PeriodicoImpl extends PublicacaoImpl implements Periodico {
	/**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected String nome = NOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditor() <em>Editor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditor()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditor() <em>Editor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditor()
	 * @generated
	 * @ordered
	 */
	protected String editor = EDITOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeridiocidade() <em>Peridiocidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeridiocidade()
	 * @generated
	 * @ordered
	 */
	protected static final Date PERIDIOCIDADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeridiocidade() <em>Peridiocidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeridiocidade()
	 * @generated
	 * @ordered
	 */
	protected Date peridiocidade = PERIDIOCIDADE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PERIODICO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNome(String newNome) {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERIODICO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditor() {
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditor(String newEditor) {
		String oldEditor = editor;
		editor = newEditor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERIODICO__EDITOR, oldEditor, editor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPeridiocidade() {
		return peridiocidade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeridiocidade(Date newPeridiocidade) {
		Date oldPeridiocidade = peridiocidade;
		peridiocidade = newPeridiocidade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERIODICO__PERIDIOCIDADE, oldPeridiocidade, peridiocidade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PERIODICO__NOME:
				return getNome();
			case ModelPackage.PERIODICO__EDITOR:
				return getEditor();
			case ModelPackage.PERIODICO__PERIDIOCIDADE:
				return getPeridiocidade();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.PERIODICO__NOME:
				setNome((String)newValue);
				return;
			case ModelPackage.PERIODICO__EDITOR:
				setEditor((String)newValue);
				return;
			case ModelPackage.PERIODICO__PERIDIOCIDADE:
				setPeridiocidade((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.PERIODICO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case ModelPackage.PERIODICO__EDITOR:
				setEditor(EDITOR_EDEFAULT);
				return;
			case ModelPackage.PERIODICO__PERIDIOCIDADE:
				setPeridiocidade(PERIDIOCIDADE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.PERIODICO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case ModelPackage.PERIODICO__EDITOR:
				return EDITOR_EDEFAULT == null ? editor != null : !EDITOR_EDEFAULT.equals(editor);
			case ModelPackage.PERIODICO__PERIDIOCIDADE:
				return PERIDIOCIDADE_EDEFAULT == null ? peridiocidade != null : !PERIDIOCIDADE_EDEFAULT.equals(peridiocidade);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nome: ");
		result.append(nome);
		result.append(", editor: ");
		result.append(editor);
		result.append(", peridiocidade: ");
		result.append(peridiocidade);
		result.append(')');
		return result.toString();
	}

} //PeriodicoImpl
