package Logistic;

/**
 * �߼�˹��ģ�͹�ʽ
 * 
 * @author lyq
 * 
 */
public class LogisticTool {
	/**
	 * �߼�˹�ٻع�ģ��
	 * 
	 * @param x
	 *            �Ա�����ֵ
	 * @param param
	 *            ����õĲ�������
	 * @return
	 */
	public double logisticRegression(int x, double... param) {
		double temp;
		double pro = 0;

		// ����e�Ĵη���
		temp = param[0];
		for (int i = 1; i < param.length; i++) {
			temp += param[i] * x;
		}

		// �����߼�˹�ٻع鷽�̽��м���
		pro = Math.exp(temp) / (1 + Math.exp(temp));

		return pro;
	}

	/**
	 * �߼�˹������ģ������Ϣ���������ϵ�Ӧ��
	 * 
	 * @param B
	 *            ����ֵ
	 * @param b
	 *            ����ֵ
	 * @param t
	 *            ��Ϣ������ʱ��
	 * @return
	 */
	public double logisticMessageSpread(double B, double b, double t) {
		double pro;

		pro = 1 / (1 + B * Math.exp(-b * t));

		return pro;
	}

	/**
	 * �߼�˹��ģ��������Ԥ���ϵ�Ӧ��
	 * 
	 * @param a
	 *            ��ĸ����
	 * @param B
	 *            ����ֵ
	 * @param b
	 *            ����ֵ
	 * @param t
	 *            ����Ԥ��ʱ��
	 * @return
	 */
	public double logisticSalingPredict(double a, double B, double b, double t) {
		double pro;

		pro = a / (1 + B * Math.exp(-b * t));

		return pro;
	}
}
