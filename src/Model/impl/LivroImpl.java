/**
 */
package Model.impl;

import Model.Livro;
import Model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Livro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.LivroImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link Model.impl.LivroImpl#getEditora <em>Editora</em>}</li>
 *   <li>{@link Model.impl.LivroImpl#getEdicao <em>Edicao</em>}</li>
 *   <li>{@link Model.impl.LivroImpl#getVolume <em>Volume</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LivroImpl extends PublicacaoImpl implements Livro {
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
	 * The default value of the '{@link #getEditora() <em>Editora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditora()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITORA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditora() <em>Editora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditora()
	 * @generated
	 * @ordered
	 */
	protected String editora = EDITORA_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdicao() <em>Edicao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdicao()
	 * @generated
	 * @ordered
	 */
	protected static final int EDICAO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEdicao() <em>Edicao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdicao()
	 * @generated
	 * @ordered
	 */
	protected int edicao = EDICAO_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final int VOLUME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected int volume = VOLUME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LivroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.LIVRO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIVRO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditora() {
		return editora;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditora(String newEditora) {
		String oldEditora = editora;
		editora = newEditora;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIVRO__EDITORA, oldEditora, editora));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEdicao() {
		return edicao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdicao(int newEdicao) {
		int oldEdicao = edicao;
		edicao = newEdicao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIVRO__EDICAO, oldEdicao, edicao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(int newVolume) {
		int oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIVRO__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.LIVRO__NOME:
				return getNome();
			case ModelPackage.LIVRO__EDITORA:
				return getEditora();
			case ModelPackage.LIVRO__EDICAO:
				return new Integer(getEdicao());
			case ModelPackage.LIVRO__VOLUME:
				return new Integer(getVolume());
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
			case ModelPackage.LIVRO__NOME:
				setNome((String)newValue);
				return;
			case ModelPackage.LIVRO__EDITORA:
				setEditora((String)newValue);
				return;
			case ModelPackage.LIVRO__EDICAO:
				setEdicao(((Integer)newValue).intValue());
				return;
			case ModelPackage.LIVRO__VOLUME:
				setVolume(((Integer)newValue).intValue());
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
			case ModelPackage.LIVRO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case ModelPackage.LIVRO__EDITORA:
				setEditora(EDITORA_EDEFAULT);
				return;
			case ModelPackage.LIVRO__EDICAO:
				setEdicao(EDICAO_EDEFAULT);
				return;
			case ModelPackage.LIVRO__VOLUME:
				setVolume(VOLUME_EDEFAULT);
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
			case ModelPackage.LIVRO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case ModelPackage.LIVRO__EDITORA:
				return EDITORA_EDEFAULT == null ? editora != null : !EDITORA_EDEFAULT.equals(editora);
			case ModelPackage.LIVRO__EDICAO:
				return edicao != EDICAO_EDEFAULT;
			case ModelPackage.LIVRO__VOLUME:
				return volume != VOLUME_EDEFAULT;
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
		result.append(", editora: ");
		result.append(editora);
		result.append(", edicao: ");
		result.append(edicao);
		result.append(", volume: ");
		result.append(volume);
		result.append(')');
		return result.toString();
	}

} //LivroImpl
