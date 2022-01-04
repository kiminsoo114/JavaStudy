package com.sist.Ex;

class Tv1 {
	boolean power; // 전원상태(on/off)
	int channel; // 채널

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
		boolean power; // 전원상태(on/off)
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
		VCR vcr = new VCR(); // VCR 클래스를 포함시켜서 사용한다.
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
