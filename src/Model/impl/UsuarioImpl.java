/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Usuario;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.UsuarioImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getInstituto_Faculdade <em>Instituto Faculdade</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getNumRegistro <em>Num Registro</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getRg <em>Rg</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getCpf <em>Cpf</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getTipoUsuario <em>Tipo Usuario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsuarioImpl extends MinimalEObjectImpl.Container implements Usuario {
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
	 * The default value of the '{@link #getInstituto_Faculdade() <em>Instituto Faculdade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstituto_Faculdade()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTO_FACULDADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstituto_Faculdade() <em>Instituto Faculdade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstituto_Faculdade()
	 * @generated
	 * @ordered
	 */
	protected String instituto_Faculdade = INSTITUTO_FACULDADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumRegistro() <em>Num Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumRegistro()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_REGISTRO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumRegistro() <em>Num Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumRegistro()
	 * @generated
	 * @ordered
	 */
	protected int numRegistro = NUM_REGISTRO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRg() <em>Rg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRg()
	 * @generated
	 * @ordered
	 */
	protected static final int RG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRg() <em>Rg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRg()
	 * @generated
	 * @ordered
	 */
	protected int rg = RG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected static final int CPF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected int cpf = CPF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoUsuario() <em>Tipo Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoUsuario()
	 * @generated
	 * @ordered
	 */
	protected static final int TIPO_USUARIO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTipoUsuario() <em>Tipo Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoUsuario()
	 * @generated
	 * @ordered
	 */
	protected int tipoUsuario = TIPO_USUARIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.USUARIO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstituto_Faculdade() {
		return instituto_Faculdade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstituto_Faculdade(String newInstituto_Faculdade) {
		String oldInstituto_Faculdade = instituto_Faculdade;
		instituto_Faculdade = newInstituto_Faculdade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__INSTITUTO_FACULDADE, oldInstituto_Faculdade, instituto_Faculdade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumRegistro() {
		return numRegistro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumRegistro(int newNumRegistro) {
		int oldNumRegistro = numRegistro;
		numRegistro = newNumRegistro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__NUM_REGISTRO, oldNumRegistro, numRegistro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRg() {
		return rg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRg(int newRg) {
		int oldRg = rg;
		rg = newRg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__RG, oldRg, rg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpf() {
		return cpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpf(int newCpf) {
		int oldCpf = cpf;
		cpf = newCpf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__CPF, oldCpf, cpf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoUsuario(int newTipoUsuario) {
		int oldTipoUsuario = tipoUsuario;
		tipoUsuario = newTipoUsuario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__TIPO_USUARIO, oldTipoUsuario, tipoUsuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reservarExemplar(int numRegistro, int idExemplar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelaReserva(int numRegistro, int idExemplar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void emprestaReserva(int numRegistro, int idExemplar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.USUARIO__NOME:
				return getNome();
			case ModelPackage.USUARIO__INSTITUTO_FACULDADE:
				return getInstituto_Faculdade();
			case ModelPackage.USUARIO__NUM_REGISTRO:
				return new Integer(getNumRegistro());
			case ModelPackage.USUARIO__RG:
				return new Integer(getRg());
			case ModelPackage.USUARIO__CPF:
				return new Integer(getCpf());
			case ModelPackage.USUARIO__TIPO_USUARIO:
				return new Integer(getTipoUsuario());
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
			case ModelPackage.USUARIO__NOME:
				setNome((String)newValue);
				return;
			case ModelPackage.USUARIO__INSTITUTO_FACULDADE:
				setInstituto_Faculdade((String)newValue);
				return;
			case ModelPackage.USUARIO__NUM_REGISTRO:
				setNumRegistro(((Integer)newValue).intValue());
				return;
			case ModelPackage.USUARIO__RG:
				setRg(((Integer)newValue).intValue());
				return;
			case ModelPackage.USUARIO__CPF:
				setCpf(((Integer)newValue).intValue());
				return;
			case ModelPackage.USUARIO__TIPO_USUARIO:
				setTipoUsuario(((Integer)newValue).intValue());
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
			case ModelPackage.USUARIO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case ModelPackage.USUARIO__INSTITUTO_FACULDADE:
				setInstituto_Faculdade(INSTITUTO_FACULDADE_EDEFAULT);
				return;
			case ModelPackage.USUARIO__NUM_REGISTRO:
				setNumRegistro(NUM_REGISTRO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__RG:
				setRg(RG_EDEFAULT);
				return;
			case ModelPackage.USUARIO__CPF:
				setCpf(CPF_EDEFAULT);
				return;
			case ModelPackage.USUARIO__TIPO_USUARIO:
				setTipoUsuario(TIPO_USUARIO_EDEFAULT);
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
			case ModelPackage.USUARIO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case ModelPackage.USUARIO__INSTITUTO_FACULDADE:
				return INSTITUTO_FACULDADE_EDEFAULT == null ? instituto_Faculdade != null : !INSTITUTO_FACULDADE_EDEFAULT.equals(instituto_Faculdade);
			case ModelPackage.USUARIO__NUM_REGISTRO:
				return numRegistro != NUM_REGISTRO_EDEFAULT;
			case ModelPackage.USUARIO__RG:
				return rg != RG_EDEFAULT;
			case ModelPackage.USUARIO__CPF:
				return cpf != CPF_EDEFAULT;
			case ModelPackage.USUARIO__TIPO_USUARIO:
				return tipoUsuario != TIPO_USUARIO_EDEFAULT;
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
		result.append(", Instituto_Faculdade: ");
		result.append(instituto_Faculdade);
		result.append(", numRegistro: ");
		result.append(numRegistro);
		result.append(", rg: ");
		result.append(rg);
		result.append(", cpf: ");
		result.append(cpf);
		result.append(", tipoUsuario: ");
		result.append(tipoUsuario);
		result.append(')');
		return result.toString();
	}

} //UsuarioImpl
