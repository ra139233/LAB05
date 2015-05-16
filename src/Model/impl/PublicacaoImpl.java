/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Publicacao;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publicacao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.PublicacaoImpl#getAutor <em>Autor</em>}</li>
 *   <li>{@link Model.impl.PublicacaoImpl#getDataPublicacao <em>Data Publicacao</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublicacaoImpl extends ExemplarImpl implements Publicacao {
	/**
	 * The default value of the '{@link #getAutor() <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutor() <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected String autor = AUTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataPublicacao() <em>Data Publicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPublicacao()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATA_PUBLICACAO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataPublicacao() <em>Data Publicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPublicacao()
	 * @generated
	 * @ordered
	 */
	protected Date dataPublicacao = DATA_PUBLICACAO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicacaoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PUBLICACAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutor(String newAutor) {
		String oldAutor = autor;
		autor = newAutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__AUTOR, oldAutor, autor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPublicacao(Date newDataPublicacao) {
		Date oldDataPublicacao = dataPublicacao;
		dataPublicacao = newDataPublicacao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__DATA_PUBLICACAO, oldDataPublicacao, dataPublicacao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PUBLICACAO__AUTOR:
				return getAutor();
			case ModelPackage.PUBLICACAO__DATA_PUBLICACAO:
				return getDataPublicacao();
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
			case ModelPackage.PUBLICACAO__AUTOR:
				setAutor((String)newValue);
				return;
			case ModelPackage.PUBLICACAO__DATA_PUBLICACAO:
				setDataPublicacao((Date)newValue);
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
			case ModelPackage.PUBLICACAO__AUTOR:
				setAutor(AUTOR_EDEFAULT);
				return;
			case ModelPackage.PUBLICACAO__DATA_PUBLICACAO:
				setDataPublicacao(DATA_PUBLICACAO_EDEFAULT);
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
			case ModelPackage.PUBLICACAO__AUTOR:
				return AUTOR_EDEFAULT == null ? autor != null : !AUTOR_EDEFAULT.equals(autor);
			case ModelPackage.PUBLICACAO__DATA_PUBLICACAO:
				return DATA_PUBLICACAO_EDEFAULT == null ? dataPublicacao != null : !DATA_PUBLICACAO_EDEFAULT.equals(dataPublicacao);
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
		result.append(" (autor: ");
		result.append(autor);
		result.append(", dataPublicacao: ");
		result.append(dataPublicacao);
		result.append(')');
		return result.toString();
	}

} //PublicacaoImpl
