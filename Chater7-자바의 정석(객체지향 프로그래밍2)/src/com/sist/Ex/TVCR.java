package com.sist.Ex;

class Tv1 {
	boolean power; // ��������(on/off)
	int channel; // ä��

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

	class VCR {
		boolean power; // ��������(on/off)
		int counter = 0;

		void power() {
			power = !power;
		}

		void play() {

		}

		void stop() {

		}

		void rew() {

		}

		void ff() {

		}
	}

	public class TVCR extends Tv {
		VCR vcr = new VCR(); // VCR Ŭ������ ���Խ��Ѽ� ����Ѵ�.
		int counter = vcr.counter;

		void plsy() {
			vcr.play();
		}

		void stop() {
			vcr.stop();
		}

		void rew() {
			vcr.rew();
		}

		void ff() {
			vcr.ff();
		}
	}

}
